package com.tom;

import java.util.Scanner;

public class New {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you enter? (y/N)");
		String line = scanner.nextLine();
	    boolean yes = line.equalsIgnoreCase("y");
		Interduce inter = new Interduce(yes);
		if(inter.yes) {
			while(line.equals("y")) {
				inter.starInput();
			}
		}else {
			System.out.println("bye");
		}
				
	}

}
