package com.portfolio.fkrenn.Interface;

import com.portfolio.fkrenn.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    
    //Método para traer una lista con personas
    public List<Persona> getPersona();
    
    //Método para guardar una persona
    public void savePersona(Persona persona);
    
    //Eliminar una persona buscando por ID
    public void deletePersona(Long id);
    
    //Buscar persona por ID
    public Persona findPersona(Long id);
}
