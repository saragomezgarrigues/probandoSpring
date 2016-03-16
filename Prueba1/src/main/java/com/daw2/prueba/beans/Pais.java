package com.daw2.prueba.beans;


import org.springframework.stereotype.Component;

@Component
public class Pais {
	private String nombre,continente;
	
	
	public Pais() {

	}//Pais Constructor vacio

	public Pais(String nombre, String continente) {
		this.nombre = nombre;
		this.continente = continente;
	}//Pais constructor lleno

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}
	
}//class
