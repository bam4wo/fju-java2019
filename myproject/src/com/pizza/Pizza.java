package com.pizza;

import java.util.Scanner;

public class Pizza {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		try {
			System.out.print("請問要切幾塊?(8,12,16)");
			Number num = new Number(sca.nextLine());
		}catch(OutofRangeException e) {
			System.out.print(e.getMessage());
		}catch(ZeroException b) {
			System.out.print(b.getMessage());
		}catch(FormatException a) {
			System.out.print(a.getMessage());
		}catch(LessExceotion e) {
			System.out.print(e.getMessage());
		}

	}

}
