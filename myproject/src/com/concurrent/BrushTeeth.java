package com.concurrent;

public class BrushTeeth implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("brush teeth");
			Thread.sleep(3000);
			System.out.println("brushed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
