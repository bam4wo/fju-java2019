package com.inout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderTester {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("data.txt");
			Reader in = new InputStreamReader(fis);
			int t = in.read();
			while( t != -1) {
				System.out.print(t);
				System.out.print((char)t);
				t = in.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
