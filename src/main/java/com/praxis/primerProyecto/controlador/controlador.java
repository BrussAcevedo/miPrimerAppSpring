package com.praxis.primerProyecto.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.praxis.primerProyecto.DTO.PersonaDTO;




@Controller
public class controlador {

	
	@RequestMapping(value = ("/"), method = RequestMethod.GET)
	public String inicio(Model model) {
		PersonaDTO persona = new PersonaDTO("Bruss", "Acevedo", 29);
		model.addAttribute("persona", persona);
		
		return "inicio";
	}
	
	
	
}
