package com.erwinner.stream;

/*
 * Apartir de ahora con java 8 se pueden crear intefaces con metodos static y defaul
 * 1.- M�todo static:
 * 			Estos m�todos se les puede colocar su comprtamiensto
 * 			El m�todo No se podran sobre escribir
 *  
 * 2.- M�todos Default
 * 		Esta metods tambien tienen definido el comportamiento predeterminado(Default) del m�todo
 * 		Este m�tod si se puede sobre escribir, si no se sobre escribe tendr� el comportamiento por default
 * */
interface Follower {
	static void saludar() {// este metodo static, no se podr� sobreescribir
		System.out.println("Hola Bienvenido!!"); 
	}
	
	default void mensaje(String name) { // comportamiento por default del m�tod
		System.out.println("Hola "+name+" estas son tus notificaciones:");
	}
	
	default void seguir(String name) { // comportamiento por default del m�tod
		System.out.println("Ahora sigues a "+name);
	}
	
	void cerrandoSesion(String name);
	
	
}


//clase que impelmata la intefaz
//no podr� sobre escribir el metodo statico
class TwitterFollower implements Follower{

	@Override
	public void mensaje(String name) {// se sobre escribe el comportamiento del m�todo por default
		System.out.println("Bienvenido a Twitter "+name+", estas son tus notificaciones:");
	}

	@Override
	public void cerrandoSesion(String name) {
		System.out.println("Hatas luego "+name+"!!");
	}
}

public class MainInteface {
	
	public static void main(String[] args) {
		//recordemos que los metodos staticos no necesitan un objeto para poder ser invocados
		Follower.saludar();
		
		TwitterFollower twitter = new TwitterFollower();
		twitter.mensaje("Erwin");
		twitter.seguir("Suga");
		twitter.cerrandoSesion("Erwin");
		

		
		
		
	}

}
