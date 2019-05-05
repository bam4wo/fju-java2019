package com.tom;

public class ScoreFormatException extends Exception{

	@Override
	public String getMessage() {
		return "Score Format invalid, cannot convert to int";
	}
	
}
