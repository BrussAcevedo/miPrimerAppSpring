package com.praxis.primerProyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.praxis.primerProyecto.DTO.PersonaDTO;

@SpringBootApplication
public class DesafioMiPrimerSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioMiPrimerSpringApplication.class, args);
		
		PersonaDTO persona = new PersonaDTO("Juan", "Pérez", 20);
			
		System.out.println("Nombre: " +  persona.getNombre());
		System.out.println("Apellido: " + persona.getApellido());
		System.out.println("Edad: " + persona.getEdad());
		
	}

}
