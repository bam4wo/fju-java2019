package com.pizza;

public class ZeroException extends Exception{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "你確定不要切?";
	}

}
