package com.erwinner.hilos;


/*
 * Se crea un hilo, de la forma tradicional (Imperativa) y creando ese mismo hilo usando funciones (Declarativa)
 * @Tag Primer
 * 		-Runnable
 * 		-Thread
 * 		-start
 * */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Form Tradicional de hacrer un hila, forma Imperativa
		Thread hilo = new Thread(new Hilo());
		hilo.start();
		
		
		// nueva forma de hacre un hilo sin necesidad de crar una clase, con funciones o forma declarativa
		Runnable runnable = () -> {
			for (int i = 0; i <10; i++) {
				System.out.println("Holo2->"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread hilo2 = new Thread(runnable);
		hilo2.start();
	}

}
