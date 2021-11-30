package com.erwinner.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Se haran direnetes ejercicios de Filtrado
 * 
 * */

public class MainFilter {
	public static void main(String[] args) {
		List<Persona> personas =Arrays.asList(new Persona("Chene","Galeana",27),
				new Persona("Hector","Brave",17),
				new Persona("Edwar","Cantu",16),
				new Persona("Evelin","Pelaez",28),
				new Persona("Ojilver","Juarez",29),
				new Persona("Miguel","Solano",28),
				new Persona("Diana","Velez",27));
		
		/*
		 * Filtra por las 3 primer peronas que sean mayores o igula a 18 anios
		 * 1.- Iterar el filtro con la misma lista
		 * 2.- Recuparer el filtro en un Stram e iterarlo
		 * 3.- Recupera el filto en un ArrayList e iterarlo
		 * 
		 * */
		System.out.println("=== Iteracion en la misma lista ===");
		personas.stream().filter(persona -> persona.getEdad()>=18).limit(3).forEach(System.out::println);
		
		System.out.println("=== Iteracion el nuevo Stram ===");
		Stream<Persona> resultStream = personas.stream().filter(persona -> persona.getEdad()>=18).limit(3);
		resultStream.forEach(System.out::println);
		
		System.out.println("=== Iteracion el nuevo List ===");
		List<Persona> resultList = personas.stream().filter(persona -> persona.getEdad()>=18).limit(3).collect(Collectors.toList());
		resultList.forEach(System.out::println);
		
		Predicate<String> startWithE = x -> x.startsWith("E");
		Predicate<Integer> mayoDeEdad= x -> x >=18;
		
		personas.stream().filter(persona -> {
			return  persona.getEdad()<18 &&   persona.getNombre().startsWith("E");
		}).limit(3).forEach(System.out::println);
		
		System.out.println("\n");
		
		/*
		 * 
		 * */
		
	}	 

}
