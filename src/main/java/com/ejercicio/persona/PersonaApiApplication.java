package com.ejercicio.persona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ejercicio.persona")
public class PersonaApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(PersonaApiApplication.class, args);
    }
}
