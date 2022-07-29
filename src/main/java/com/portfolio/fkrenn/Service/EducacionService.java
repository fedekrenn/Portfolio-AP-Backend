package com.portfolio.fkrenn.Service;

import com.portfolio.fkrenn.Entity.Educacion;
import com.portfolio.fkrenn.Repository.EducacionRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService {
    @Autowired
    EducacionRepository rEducacion;
    
    public List<Educacion> list(){
        return rEducacion.findAll();
    }
    
    public Optional<Educacion> getOne(int id){
        return rEducacion.findById(id);
    }
    
    public Optional<Educacion> getByNombreEducacion(String nombreEducacion){
        return rEducacion.findByNombreEducacion(nombreEducacion);
    }
    
    public void save(Educacion educacion){
        rEducacion.save(educacion);
    }
    
    public void delete(int id){
        rEducacion.deleteById(id);
    }
    
    public boolean existById(int id){
        return rEducacion.existsById(id);
    }
    
    public boolean existByNombreEducacion(String nombreEducacion){
        return rEducacion.existsByNombreEducacion(nombreEducacion);
    }
    
}
