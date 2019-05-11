package com.asthvinayak.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<String>();

		set.add("kalyan1");
		set.add("kalyan1");// String---->Object
		set.add("manish3");
		set.add("babrak4"); // String---->Object
		set.add("kumer5");
		set.add("aaaa");
		
		
		Set<Integer> set2 = new TreeSet<Integer>();		
		set2.add(2);
		set2.add(3);
		set2.add(1);
		System.out.println(set); /// maintance the order   1 2 3 

		for (Integer s : set2) {
			System.out.println(s);
		}

	}

}
