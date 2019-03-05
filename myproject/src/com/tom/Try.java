package com.tom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Try {

	public static void main(String[] args) {
		List<Integer> bag = new ArrayList<>();
		bag.add(10);
		bag.add(7);
		bag.add(408);
		bag.add(10);
		System.out.println(bag);
		
		List<String> bagger = new ArrayList<>();
		bagger.add("a");
		bagger.add("b");
		bagger.add("a");
		bagger.add("a");
		System.out.println(bagger);
		
		Set<Integer> set = new HashSet<>();
		set.add(1485);
		set.add(99);
		set.add(1485);
		set.add(88);
		System.out.println(set);
		
		Set<String> setter = new HashSet<>();
		setter.add("aaa");
		setter.add("ccc");
		setter.add("bbb");
		setter.add("aaa");
		System.out.println(setter);

	}

}
