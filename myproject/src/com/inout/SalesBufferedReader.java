package com.inout;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SalesBufferedReader {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("sales.txt");
			InputStreamReader irs = new InputStreamReader(fis);
			BufferedReader in = new  BufferedReader(irs);
			String line = in.readLine();
			while(line != null) {
				//System.out.println(line);
				String[] token = line.split(",");
				if(token.length == 2) {
					System.out.print(token[0] + "/" + token[1] + " ");
					int n = Integer.parseInt(token[1]);
					if(n > 50) {
						int a = 50*50+(n-50)*60;
						System.out.println("$" + a);
					}else {
						int b = n*50;
						System.out.println("$" + b);
					}
				}
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
			
	}

}
