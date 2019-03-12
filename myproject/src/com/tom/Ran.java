package com.tom;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Ran {

	public static void main(String[] args) {
		Random ran = new Random(20);
		Map<Integer, Integer> map= new HashMap<Integer, Integer>();
		for(int i = 0 ; i<10000; i++) {
			int a = ran.nextInt(20);
			Integer freq = map.get(a);
			if (freq == null) {
				map.put(a, 1);
			}else{
				map.put(a, freq+1);
			}
			
		}
		System.out.println(map);

	}

}
