package com.tom;

public class Ticket {
	protected String name;
	int number;
	int phone;
	double price;
	
	public Ticket(String name, int number,int phone, double price) {
		this.name = name;
		this.number = number;
		this.phone = phone;
		this.price = price;
	}
	
	public void print() {
		System.out.println(name +"\t"+ number +"\t"+ phone +"\t"+ price);
	}
}
