package com.tom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTry {

	public static void main(String[] args) {
		Random ran = new Random();
		List<Integer> bag = new ArrayList<>();
		for(int b = 0; b<20; b++) {
			bag.add(0);
		}
		for(int i = 0; i<10000; i++) {
			int a = ran.nextInt(20);
			Integer freq = bag.get(a);
			bag.set(a, freq+1);
		}
	
		System.out.println(bag);
	}
}
