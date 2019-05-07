package com.pizza;

public class FormatException extends Exception {

	@Override
	public String getMessage() {
		return "格式錯誤";
	}

}
