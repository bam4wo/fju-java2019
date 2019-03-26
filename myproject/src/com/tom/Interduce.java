package com.tom;

import java.util.Scanner;

public class Interduce {
	String name;
	int count;
	boolean yes;
	
	public Interduce(boolean yes) {
		this.yes = yes;
	}
	
	public Interduce(String name ,int count) {
		this.name = name;
		this.count = count;
	}
	
	
	public void starInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter name");
		String name = scanner.nextLine();
		System.out.println("please enter count");
		int count  = scanner.nextInt();
		System.out.println(name+"\t"+count);
		
	}
}
