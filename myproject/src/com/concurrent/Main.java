package com.concurrent;

public class Main {

	public static void main(String[] args) {
		System.out.println("Holle World!");
		Breakfast bf = new Breakfast();
		bf.start();
		BrushTeeth bt = new BrushTeeth();
		Thread thread = new Thread(bt);
		thread.start();
		

	}

}
