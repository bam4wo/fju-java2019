package com.score;

public class Score {
	int value;
	public Score(String s) throws ScoreFormatException, ScoreOutofRangeException{
		try {
			value = Integer.parseInt(s);
		} catch(NumberFormatException a) {
			throw new ScoreFormatException();
		}
		value = Integer.parseInt(s);
		if(value>100 || value<0) {
			throw new ScoreOutofRangeException();
		}
		
	}
}
