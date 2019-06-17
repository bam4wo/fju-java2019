package com.pizza;

public class Number {
	int number;
	public Number(String s) throws OutofRangeException, ZeroException, FormatException, LessExceotion{
		try {
			number = Integer.parseInt(s);
		}catch(NumberFormatException e){
			throw new FormatException();
		}
		number = Integer.parseInt(s);
		if(number>16 || number<0) {
			throw new OutofRangeException();
		}else if(number == 0){
			throw new ZeroException();
		}else if(number == 8 || number == 12 || number == 16) {
			System.out.println("謝謝選購");
		}else {
			throw new LessExceotion();
		}
			
			
		
		
	}
}
