package com.ejercicio.persona.controller;

import com.ejercicio.persona.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/api/persona")
public class PersonaController {
    @Autowired
    private PersonaService personaService;
    @PostMapping("/create")
    public ResponseEntity<Map<String, String>> createPersona(@RequestBody Map<String, Object> payload) {
        String nombre = payload.get("nombre").toString();
        Integer edad = Integer.parseInt(payload.get("edad").toString());

        String respuesta = personaService.savePersona(nombre, edad);
        return ResponseEntity.ok(Collections.singletonMap("Respuesta", respuesta));
    }
}
