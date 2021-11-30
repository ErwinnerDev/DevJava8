package com.erwinner.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


/*
 * Por demedio de una lista se haran ciertos ordenamientos, para ellos se utilizara la propiedad Comparator
 * >> Se haran filtro de un solo elemento de forma Acendente y Decendnete, conservando la lista original y actualizando la lista original
 * >> Se haran filtros de más de un elemento de forma Acendente y Decenente, conservando la lista oprigina y Actualizando la lista original
 * 
 * @Tag Primer
 * 		-compareTo
 * 		-Comparator.comparing
 * 			-Comparator
 * 			-comparing
 * 		-thenComparing
 * 
 * @Tag secundario 
 * 		-sorted
 * 		-sort
 * 		-forEach
 * */
public class Main {

	public static void main(String[] args) {
		List<Persona> listPersonas =Arrays.asList(new Persona("Evelin","Pelaez",30),
												new Persona("Ojilver","Juarez",29),
												new Persona("Evelin","Pelaez",26),
												new Persona("Chene","Galeana",27));
		
		
		/*
		 * Ordenar la lista por edad de forma Acendente
		 * Aplicando INUTABILIDAD a la lista, por lo que los originales se mantendran intactos
		 * */
		System.out.println("==== Lista Tem ordenada solo por edad Acendentemente ====");
		listPersonas.stream().sorted((x,y)-> x.getEdad().compareTo(y.getEdad())).forEach(System.out::println);
		
		/*
		 * Ordenar la lista por edad de forma Descendente
		 * Aplicando INUTABILIDAD a la lista, por lo que los originales se mantendran intactos
		 * */
		System.out.println("==== Lista Tem ordenada solo por edad Decendente ====");
		listPersonas.stream().sorted((x,y)-> y.getEdad().compareTo(x.getEdad())).forEach(System.out::println);
		
		/*
		 * Mostrar la lista Original y comprobra la Inmutablidad de la lista
		 * */
		System.out.println("==== Lista Original ====");
		listPersonas.forEach(System.out::println);
		
		/*
		 * Ordenar la lista por edad de forma Ascendente
		 * Sobre la lista original
		 * */
		System.out.println("==== Lista Original ordenada solo por edad Decendente ====");
		listPersonas.sort((x,y)-> y.getEdad().compareTo(x.getEdad()));
		listPersonas.forEach(System.out::println);
		
		
		/*
		 * ORDEN DEL FILTRO
		 * Se desea ordenar por mas de un elemeto de la lista 
		 * Ordenar de forma alfabetica(Acendente) por nombre
		 * Ordenra de forma alfabetica(Acendente) por apellido
		 * Ordenar de forma Acendente por edad;
		 
		 * */
		
		  Comparator<Persona> comparadorMultiple= Comparator.comparing(Persona::getNombre)
				  							.thenComparing(Persona::getApellido) // //Algunos colocan el Comparator.comparing() y dentro Persona::getApellido 
				  							.thenComparing(Persona::getEdad);
		  
		  
		  /* Hacer el ordenamiento anterio definido en "ORDEN DEL FILTRO" debe de ser de forma INMUTABLE  
		   * 1.- Imprimir la datos ordenado deacuerdo a la ultima indicaciones de "ORDENR DEL FILTRO" sobre la lista INMUTABLE
		   * 2.- Almacenar e imprimir los datos modificados de la operacion 1 en una Nueva lista e imprimirlos
		   * 3.- Imprimir la lista Oroginal para comprobar la Inmutablidad de la lista 
		   * */
		  System.out.println("=== Lista Tem Nombre:Asc, Apellido:Asc, Edad:Asc | Temp | Sobre la lista Original===");
		  listPersonas.stream().sorted(comparadorMultiple).forEach(System.out::println);
		  
		  System.out.println("=== Lista Nombre:Asc, Apellido:Asc, Edad:Asc | Nueva Lista | sobre la misma lista (Nueva)===");
		  List<Persona> result = listPersonas.stream().sorted(comparadorMultiple).collect(Collectors.toList());
		  result.forEach(System.out::println);
		  
		  System.out.println("=== Lista Original Inmutada | Original | sobre la misma lista (Original)  ===");
		  listPersonas.forEach(System.out::println);
		  

		  /* Hacer el ordenamiento anterio definido en "ORDEN DEL FILTRO" debe de ser aplica EN la lista Original
		   * 1.- Imprimir la lista Oroginal para comprobar que los filtros se aplicaron  a lista original 
		   * */
		  System.out.println("=== Lista Original  Nombre:Asc, Apellido:Asc, Edad:Ace | Original | sobre la misma lista (Original)  ===");
		  listPersonas.sort(comparadorMultiple);
		  listPersonas.forEach(System.out::println);
		  
		  
		  /*
			 * ORDEN DEL FILTRO
			 * Se desea ordenar por mas de un elemeto de la lista 
			 * Ordenar de forma alfabetica(Acendente) por nombre
			 * Ordenra de forma alfabetica(Acendente) por apellido
			 * Ordenar de forma DESCENDNETE por edad
			 * 1.- Estos cambios deben ser aplicados En la lista original e imprimirlos 
			 * */
		  
		  System.out.println("=== Lista Original  Nombre:Asc, Apellido:Asc, Edad:DES | Original | sobre la misma lista (Original)  ===");
		  comparadorMultiple= Comparator.comparing(Persona::getNombre)
					.thenComparing(Comparator.comparing(Persona::getApellido)) //Algunos colocan el Comparator.comparing() pero es necesario
					.thenComparing(Persona::getEdad,Comparator.reverseOrder());
		  
		  listPersonas.sort(comparadorMultiple);
		  listPersonas.forEach(System.out::println);


	}

}
