package com.portfolio.fkrenn.Controller;

import com.portfolio.fkrenn.Dto.dtoProyectos;
import com.portfolio.fkrenn.Entity.Proyectos;
import com.portfolio.fkrenn.Security.Controller.Mensaje;
import com.portfolio.fkrenn.Service.ProyectosService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("proyectos")
@CrossOrigin(origins = "https://portfolio-ap-5602d.web.app/")
public class ProyectosController {
    @Autowired
    ProyectosService sProyectos;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Proyectos>> list(){
        List<Proyectos> list = sProyectos.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoProyectos dtopro) {
        if(StringUtils.isBlank(dtopro.getNombreProyecto())){
            return new ResponseEntity(new Mensaje("Debes ingresar el nombre"), HttpStatus.BAD_REQUEST);
        }
        if (sProyectos.existByNombreProyecto(dtopro.getNombreProyecto())){
            return new ResponseEntity(new Mensaje("Ya existe esa experiencia"), HttpStatus.BAD_REQUEST);
        }
        
        Proyectos proyectos = new Proyectos(dtopro.getNombreProyecto(), dtopro.getUrlRepo(), dtopro.getUrlDeploy(), dtopro.getImgProyecto(), dtopro.getDescripcionProyecto());
        sProyectos.save(proyectos);
        
        return new ResponseEntity(new Mensaje("Se agregó correctamente!"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoProyectos dtopro) {
        if (!sProyectos.existById(id)) {
            return new ResponseEntity(new Mensaje("No existe ese ID"), HttpStatus.BAD_REQUEST);
        }
        if (sProyectos.existByNombreProyecto(dtopro.getNombreProyecto()) && sProyectos.getByNombreProyecto(dtopro.getNombreProyecto()).get().getId() != id){
            return new ResponseEntity(new Mensaje("Ya existe ese proyecto"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtopro.getNombreProyecto())){
            return new ResponseEntity(new Mensaje("Debes ingresar el nombre"), HttpStatus.BAD_REQUEST);
        }
        
        Proyectos proyectos = sProyectos.getOne(id).get();
        proyectos.setNombreProyecto(dtopro.getNombreProyecto());
        proyectos.setUrlRepo(dtopro.getUrlRepo());
        proyectos.setUrlDeploy(dtopro.getUrlDeploy());
        proyectos.setImgProyecto(dtopro.getImgProyecto());
        proyectos.setDescripcionProyecto(dtopro.getDescripcionProyecto());
        
        sProyectos.save(proyectos);
        
        return new ResponseEntity(new Mensaje("Se actualizó ok la info del proyecto"), HttpStatus.OK);
    }
  
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!sProyectos.existById(id)){
            return new ResponseEntity(new Mensaje("No existe ese ID"), HttpStatus.BAD_REQUEST);
        }
        
        sProyectos.delete(id);
        return new ResponseEntity(new Mensaje("Se eliminó el proyecto!"), HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Proyectos> getById(@PathVariable("id") int id){
        if (!sProyectos.existById(id)){
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        
        Proyectos proyectos = sProyectos.getOne(id).get();
        return new ResponseEntity(proyectos, HttpStatus.OK);
    }
}
