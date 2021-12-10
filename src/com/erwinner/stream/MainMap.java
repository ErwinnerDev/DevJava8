package com.erwinner.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainMap {

	public static void main(String[] args) {
		
		List<Persona> personas =Arrays.asList(new Persona("Chene","Galeana",27),
				new Persona("Hector","Brave",17),
				new Persona("Edwar","Cantu",16),
				new Persona("Evelin","Pelaez",28),
				new Persona("Ojilver","Juarez",29),
				new Persona("Miguel","Solano",28),
				new Persona("Diana","Velez",27));
		
		
		 //Transformar: cada elemento los pasa a maysculas 
		personas.stream().map(x -> {
			return new Persona(x.getNombre().toUpperCase(),x.getApellido().toUpperCase(),x.getEdad());
		}).forEach(System.out::println);
		
		
		/*
		 * Crear una lista<String> con los nombre de las personas
		 * */
		List<String> nameCollect = personas.stream().map(x -> x.getNombre()).collect(Collectors.toList());
		nameCollect.forEach(System.out::println);
		
		
	}

}
