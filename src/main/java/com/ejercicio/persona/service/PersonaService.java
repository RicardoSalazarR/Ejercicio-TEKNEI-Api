package com.ejercicio.persona.service;
import com.ejercicio.persona.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ejercicio.persona.repository.PersonaRepository;


@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public String savePersona(String nombre, Integer edad) {
        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setEdad(edad);
        personaRepository.save(persona);

        return "El registro de " + nombre + ", próximamente tendrás " + (edad + 1) + " años.";
    }
}
