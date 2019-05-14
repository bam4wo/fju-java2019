package com.change;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadTester {
	public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("result.txt");
            //System.out.println(fis.read());
            int t = fis.read();
            while (t != -1){
                System.out.println((char)t);
                t = fis.read();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fis != null){
                try{
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }

            }
        }
    }

}
