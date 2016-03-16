package com.daw2.prueba.controllers;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.daw2.prueba.beans.Pais;


@Controller
public class PaisController {

	@RequestMapping(value = "/pais", method = RequestMethod.GET)
	public String paisGet(Locale locale, Model model){
		return "/pais/crear";
	}//pais
	
	@RequestMapping(value = "/pais", method = RequestMethod.POST)
	public String paisPost(ModelMap model,
			@RequestParam("nombrePais") String nombre,
			@RequestParam("contiente")  String continente){
		
			Pais pais=new Pais(nombre,continente);
			model.addAttribute("pais",pais);
		return "/pais/crearPost";
	}
}//class
