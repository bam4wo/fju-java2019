package com.change;

import java.io.*;

public class JavaExam {
	public static void main(String[] args) {
        System.out.println("Hello World!");
        PrintWriter out = null;
        try{
            //FileOutputStream fos = new FileOutputStream("result.txt");
            FileWriter fw = new FileWriter("result.txt");
            out = new PrintWriter(fw);
            out.write("JAVA ßd©”ªT");
            //out.write(" ±i√¿ø≥");
            /*out.write(74);
            out.write(65);
            out.write(86);
            out.write(65);
            out.write(0x21555);
            out.write(0x25215);
            out.write(0x33993);*/
            out.flush();
            out.close();
        }catch (FileNotFoundException a){
            a.printStackTrace();
        }catch (IOException b){
            b.printStackTrace();
        }finally {
            if(out != null){
                out.close();
            }
        }

    }
}

