package com.erwinner.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
 * Para el caso de los Optional quiere decir que pueda que el resultado tenga o no valor
 * Hay operaciones propias del Optiala para validaddichos casos, como el isPresent() o el .orElseThrow()
 *  @Tag Prime
 *  	-Optional
 *  	-isPresent
 *  	-orElseThrow
 *  
 * @Tag Secundario
 * 		-Arrays.asList
 * 			-asList
 * 		-filter
 * 		-findFirst
 * */
public class Main {
	//Con el Arrays.asList, inicializamos lo svalores en el arreglo
	static List<String> listNombre=Arrays.asList("Chene","Ojilver","Everlin","Gladis","Diana","Miguel");
	
	public static Optional<String> buscarNombre(String nombre){
		//COn el filter(Sentencia) se filtran solo aquellos datos que cumplan la sentencia definida
		//Con el findFirst() solo obtenemos el primer valor
		return listNombre.stream().filter(x -> x.equalsIgnoreCase(nombre)).findFirst();
	}

	public static void main(String[] args) {
		
		String nombre = "Juan";
		Optional<String> result= buscarNombre(nombre);
		if(result.isPresent()) { // con el isPresent() preguntamos si hay una objetos <T> (String en este caso) en la respuesta, [True oFalse]
			System.out.println("Se encontr� el nomnbre de: "+nombre);
		}else {
			System.out.println("El nombre: "+nombre+", no existe");
		}
		
		/* El orElseThrow(Tipo de Excepcion) esto regresa el error IllegalStateException por que as� se ha definido 
		que se maneje ese error en caso de que no sea exitoso la respuesta*/
		String nombreresult = buscarNombre(nombre).orElseThrow(() -> new IllegalStateException("No se encontr� el nombre:"+nombre));
		//Esto no se imprime encaso de error
		System.out.println(nombreresult);

	}

}
