package com.score;

public class ScoreOutofRangeException extends Exception{

	@Override
	public String getMessage() {
		return "over range";
	}
	
}
