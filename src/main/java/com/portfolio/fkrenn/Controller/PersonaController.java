package com.portfolio.fkrenn.Controller;

import com.portfolio.fkrenn.Dto.dtoPersona;
import com.portfolio.fkrenn.Entity.Persona;
import com.portfolio.fkrenn.Security.Controller.Mensaje;
import com.portfolio.fkrenn.Service.PersonaService;
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
@RequestMapping("persona")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {

    @Autowired
    PersonaService sPersona;

    @GetMapping("/lista")
    public ResponseEntity<List<Persona>> list() {
        List<Persona> list = sPersona.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoPersona dtoper) {
        if (StringUtils.isBlank(dtoper.getNombrePersona())) {
            return new ResponseEntity(new Mensaje("Debes ingresar el nombre"), HttpStatus.BAD_REQUEST);
        }
        if (sPersona.existByNombrePersona(dtoper.getNombrePersona())) {
            return new ResponseEntity(new Mensaje("Ya existe ese nombre"), HttpStatus.BAD_REQUEST);
        }

        Persona persona = new Persona(
                dtoper.getNombrePersona(),
                dtoper.getPuestoPersona(),
                dtoper.getUbicacionPersona(),
                dtoper.getImgPersona(),
                dtoper.getSobreMi(),
                dtoper.getTelPersona(),
                dtoper.getEmailPersona(),
                dtoper.getGithubPersona(),
                dtoper.getLinkedinPersona());

        sPersona.save(persona);

        return new ResponseEntity(new Mensaje("Se agregó correctamente!"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoPersona dtoper) {
        if (!sPersona.existById(id)) {
            return new ResponseEntity(new Mensaje("No existe ese ID"), HttpStatus.BAD_REQUEST);
        }
        if (sPersona.existByNombrePersona(dtoper.getNombrePersona()) && sPersona.getByNombrePersona(dtoper.getNombrePersona()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Ya existe esa persona"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtoper.getNombrePersona())) {
            return new ResponseEntity(new Mensaje("Debes ingresar el nombre"), HttpStatus.BAD_REQUEST);
        }

        Persona persona = sPersona.getOne(id).get();
        persona.setNombrePersona(dtoper.getNombrePersona());
        persona.setPuestoPersona(dtoper.getPuestoPersona());
        persona.setUbicacionPersona(dtoper.getUbicacionPersona());
        persona.setImgPersona(dtoper.getImgPersona());
        persona.setSobreMi(dtoper.getSobreMi());
        persona.setTelPersona(dtoper.getTelPersona());
        persona.setEmailPersona(dtoper.getEmailPersona());
        persona.setGithubPersona(dtoper.getGithubPersona());
        persona.setLinkedinPersona(dtoper.getLinkedinPersona());

        sPersona.save(persona);

        return new ResponseEntity(new Mensaje("Se actualizó ok la persona"), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sPersona.existById(id)) {
            return new ResponseEntity(new Mensaje("No existe ese ID"), HttpStatus.BAD_REQUEST);
        }

        sPersona.delete(id);

        return new ResponseEntity(new Mensaje("Se eliminó la persona"), HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Persona> getById(@PathVariable("id") int id) {
        if (!sPersona.existById(id)) {
            return new ResponseEntity(new Mensaje("no existe el id"), HttpStatus.NOT_FOUND);
        }

        Persona persona = sPersona.getOne(id).get();

        return new ResponseEntity(persona, HttpStatus.OK);
    }
}
