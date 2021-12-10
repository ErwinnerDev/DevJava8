package com.erwinner.metodoreferencia;

import java.util.Arrays;

/*
 * Clase en la que se muestran los Métodos de refenrencias:
 * sintaxis: NombreClase::Metodo
 * existen tres tipos 
 * 1.- Referencia a comnstructor
 * 2.- Referencia a un método de instancia
 * 3.- Referencia  un métod estatico
 * **/
import java.util.List;

class StringUtil{
	 static boolean isUpperCase(String palabra) {
		return palabra.toUpperCase().equals(palabra);
	} 
}

class Persona{
	private String nombre;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}



public class MetedoDeReferencia {
	
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("JUAN","Pedro","MARIA","Oscar","JOE");
		
		asList.stream()
				.map(Persona::new) //Method Reference Constructor
				.map(Persona::getNombre) // Method of instance 
				.filter(StringUtil::isUpperCase)//Method Reference Static
				.forEach(System.out::println); // Method of instance 
		
		
	}

}
