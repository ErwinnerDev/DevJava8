package com.erwinner.hilos;

public class Hilo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <10; i++) {
			System.out.println("Holo1->"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}