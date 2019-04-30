package com.tom;

public class ScoreOutofRangeException extends Exception{

	@Override
	public String getMessage() {
		int range;
		if(range>100 && range<0) {
			
		}
		return super.getMessage();
	}
	
}
