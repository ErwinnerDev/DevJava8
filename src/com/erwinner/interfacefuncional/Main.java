package com.erwinner.interfacefuncional;

/*
 * se crea una interfaz para poder usarla como función
 * 
 * */
public class Main {

	public static void main(String[] args) {
		Operacion suma = (valor1,valor2) -> valor1+valor2;
		Operacion resta = (v1,v2) -> v1-v2;
		Operacion areaRectangulo = (base,altura) -> {
			//code
			return (base* altura)/2;
		};
		 
		System.out.println("Suma "+suma.operacion(5, 7));
		System.out.println("resta "+resta.operacion(3, 2));
		System.out.println("Area Rectangulo: "+areaRectangulo.operacion(2, 5));

	}

}
