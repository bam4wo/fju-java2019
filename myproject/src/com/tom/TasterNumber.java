package com.tom;

import java.util.Scanner;

public class TasterNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int math = 0;
		int english = 0;
		System.out.print("請輸入數學成績");
		try {
			math = Integer.parseInt(scanner.nextLine());
		}catch(NumberFormatException m){
			System.out.println("訊息格式錯誤");
		}
		System.out.print("請輸入英文成績");
		try {
			english = Integer.parseInt(scanner.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("訊息格式錯誤");
		}
		int average = (math+english)/2;
		System.out.println("平均為:" +  average);
	}

}
