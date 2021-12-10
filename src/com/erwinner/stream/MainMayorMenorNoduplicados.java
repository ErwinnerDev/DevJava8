package com.erwinner.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainMayorMenorNoduplicados {
	public static void main(String[] args) {
		
		
		List<Persona> personas =Arrays.asList(new Persona("Chene","Galeana",27),
				new Persona("Hector","Brave",17),
				new Persona("Edwar","Cantu",16),
				new Persona("Evelin","Pelaez",28),
				new Persona("Ojilver","Juarez",29),
				new Persona("Miguel","Solano",28),
				new Persona("Diana","Velez",27));
		
		/*
		 * Obtener a la persona de menor edad:
		 * */
		  Optional<Persona> personaMasJoven = personas.stream().min((p1,p2) -> p1.getEdad().compareTo(p2.getEdad()));
		  System.out.println("La persona más joven es: "+personaMasJoven);
		
		  /*
			 * Obtener a la persona de mayor edad
			 * */
		  Optional<Persona> personaMasGrande = personas.stream().max((p1,p2) -> p1.getEdad().compareTo(p2.getEdad()));
		  System.out.println("La persona más grande es: "+personaMasGrande);
		  
		  /**
		   * Quitar los numero duplicados Inmutabilidad
		   */
		  List<Integer> listNumber = Arrays.asList(1,2,2,6,4,5,4);
		  List<Integer> numbredistinc = listNumber.stream().distinct().collect(Collectors.toList());
		  System.out.println("Numeros unicos, no duplicados");
		  numbredistinc.forEach(System.out::println);
		  
	}	 
	

}
