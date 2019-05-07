package com.change;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt("35");
		/*try {
			FileReader fr = new FileReader("aa.txt");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}*/
		File f = new File("aa.txt");
		if(f.exists()) {
			System.out.println(f.length());
			System.out.println(f.getAbsolutePath());
		}
		System.out.println(f.exists());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f.getName());
		
		/*File div = new File("C:\\AppServ");
		if(div.exists() && div.isDirectory()) {
			String [] files = div.list();
			for(String s: files) {
				System.out.println(s);
			}
		}*/
		
		File dir = new File("C:\\AppServ");
		if(dir.exists() && dir.isDirectory()) {
			File [] files = dir.listFiles();
			for(File ff: files) {
				if(ff.isFile()) {
					System.out.println(ff.getName());
				}
			}
			System.out.println(dir.mkdir());
			File dirr = new File(dir,"aaa");
			System.out.println(dirr.mkdir());
			System.out.println(dirr.delete());
		}
		
		for(int n=0 ; n<2000000; n++) {
			
		}
	}

}
