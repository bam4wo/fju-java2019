package com.tom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		List<Item> items = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		//String name = null;
		String name = "";
		while(!name.equals("q")) {
			System.out.println("Please enter item name:");
			name = scanner.nextLine();
			System.out.println("please enter quantity");
			//int quantity = scanner.nextInt(); 
			int quantity = Integer.parseInt(scanner.nextLine());
			items.add(new Item(name, quantity));
			for(Item item: items) {
				System.out.println(name+"\t"+quantity);
			}
		}
		
	}

}
