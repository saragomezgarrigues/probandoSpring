package com.daw2.prueba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.daw2.prueba.beans.Pais;
import com.daw2.prueba.beans.Persona;

@Controller
public class PersonaController {
	@RequestMapping(value = "/persona", method = RequestMethod.GET)
	public String personaGet(){
		return "persona/crear";
	}
	
	@RequestMapping(value = "/persona", method = RequestMethod.POST)
	public String personaPost(ModelMap model,
			@RequestParam("nombrePersona") String nombreP,
			@RequestParam("apellidosPersona") String apellidosP,
			@RequestParam("nombrePais") String nombrePais,
			@RequestParam("continente") String continente
			){
			
			Persona persona=new Persona(nombreP,apellidosP);
			Pais p=new Pais(nombrePais,continente);
			persona.setPais(p);
			model.addAttribute("persona",persona);
		return "persona/crearPost";
	}
}//class
