package com.portfolio.fkrenn.Controller;

import com.portfolio.fkrenn.Dto.dtoEducacion;
import com.portfolio.fkrenn.Entity.Educacion;
import com.portfolio.fkrenn.Security.Controller.Mensaje;
import com.portfolio.fkrenn.Service.EducacionService;
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
@RequestMapping("educacion")
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {

    @Autowired
    EducacionService sEducacion;

    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list() {
        List<Educacion> list = sEducacion.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoEducacion dtoedu) {
        if (StringUtils.isBlank(dtoedu.getNombreEducacion())) {
            return new ResponseEntity(new Mensaje("Debes ingresar el nombre"), HttpStatus.BAD_REQUEST);
        }

        Educacion educacion = new Educacion(
                dtoedu.getNombreEducacion(),
                dtoedu.getDescripcionEducacion(),
                dtoedu.getEstablecimiento(),
                dtoedu.getImgEducacion(),
                dtoedu.getStartEducacion(),
                dtoedu.getEndEducacion());

        sEducacion.save(educacion);

        return new ResponseEntity(new Mensaje("Se agregó correctamente!"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoEducacion dtoedu) {
        if (!sEducacion.existById(id)) {
            return new ResponseEntity(new Mensaje("No existe ese ID"), HttpStatus.BAD_REQUEST);
        }
        if (sEducacion.existByNombreEducacion(dtoedu.getNombreEducacion()) && sEducacion.getByNombreEducacion(dtoedu.getNombreEducacion()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Ya existe esa educacion"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtoedu.getNombreEducacion())) {
            return new ResponseEntity(new Mensaje("Debes ingresar el nombre"), HttpStatus.BAD_REQUEST);
        }

        Educacion educacion = sEducacion.getOne(id).get();
        educacion.setNombreEducacion(dtoedu.getNombreEducacion());
        educacion.setDescripcionEducacion(dtoedu.getDescripcionEducacion());
        educacion.setEstablecimiento(dtoedu.getEstablecimiento());
        educacion.setImgEducacion(dtoedu.getImgEducacion());
        educacion.setStartEducacion(dtoedu.getStartEducacion());
        educacion.setEndEducacion(dtoedu.getEndEducacion());

        sEducacion.save(educacion);

        return new ResponseEntity(new Mensaje("Se actualizó ok la educacion"), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sEducacion.existById(id)) {
            return new ResponseEntity(new Mensaje("No existe ese ID"), HttpStatus.BAD_REQUEST);
        }

        sEducacion.delete(id);

        return new ResponseEntity(new Mensaje("Se eliminó la educacion"), HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id") int id) {
        if (!sEducacion.existById(id)) {
            return new ResponseEntity(new Mensaje("no existe el id"), HttpStatus.NOT_FOUND);
        }

        Educacion educacion = sEducacion.getOne(id).get();

        return new ResponseEntity(educacion, HttpStatus.OK);
    }
}
