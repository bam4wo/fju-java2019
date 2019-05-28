package com.horse;

public class Main {

	public static void main(String[] args) {
		Horse h = new Horse();
		h.start();
		
		HorseRunnable h1 = new HorseRunnable();
		Thread thread = new Thread(h1);
		thread.start();
		
		System.out.println("main stop");

	}

}
