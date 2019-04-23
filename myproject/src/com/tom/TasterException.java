package com.tom;

import java.util.Scanner;

public class TasterException {

	public static void main(String[] args) {
		int bouns = 2000;
		int div = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("多少人要分?");
		String number = scanner.nextLine();
		try {
			int n = Integer.parseInt(number);
			div = bouns / n;
			System.out.print("每人分多少: " + div);
		} catch (Exception b) {
			System.out.println("資料錯誤");
		}
		/*catch(NumberFormatException a) { 
		 	System.out.println("數字格式錯誤");
	 	} catch(ArithmeticException e) { 
	 		System.out.println("數值運算錯誤"); } */

	}
}
