package com.change;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class Filetry {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("aa.txt");
		fos.write(100);
		fos.write(66);
		fos.flush();
		fos.close();
		//FileWriter fw = new FileWriter();
	}

}
