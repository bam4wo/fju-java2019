package com.score;

import java.util.Scanner;

public class ScoreTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Please enter English:");
			Score english = new Score(scanner.nextLine());
			System.out.println("Please enter Math:");
			Score math = new Score(scanner.nextLine());
			System.out.println((english.value + math.value)/2);
		} catch(ScoreFormatException e) {
			e.printStackTrace();
		} catch(ScoreOutofRangeException a) {
			a.printStackTrace();
		}

	}

}
