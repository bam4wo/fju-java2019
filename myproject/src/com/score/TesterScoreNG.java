package com.score;

import java.util.Scanner;

public class TesterScoreNG {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Please enter English:");
			int english = Integer.parseInt(scanner.nextLine());
			System.out.println("Please enter Math:");
			int math = Integer.parseInt(scanner.nextLine());
			System.out.println((english+math)/2);
		} catch(NumberFormatException e){
			System.out.println("成績格式錯誤");
			e.printStackTrace();
			
		}
		

	}

}
