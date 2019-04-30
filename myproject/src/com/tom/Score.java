package com.tom;

public class Score {
	int value;
	public Score(String s) throws ScoreFormatException{
		try {
			value = Integer.parseInt(s);
		} catch(NumberFormatException a) {
			throw new ScoreFormatException();
		} catch(Exception b) {
			try {
				throw new ScoreOutofRangeException();
			} catch (ScoreOutofRangeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
