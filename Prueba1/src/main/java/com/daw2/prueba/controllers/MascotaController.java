package com.daw2.prueba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MascotaController {
	@RequestMapping(value = "/mascota", method = RequestMethod.GET)
	public String mascotaGet(){
		return "mascota/crear";
	}
}
