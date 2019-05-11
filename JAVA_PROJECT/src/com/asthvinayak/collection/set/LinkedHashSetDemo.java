package com.asthvinayak.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		
		
		LinkedHashSet <String> set = new LinkedHashSet<String>(); 
		
		set.add("kalyan1");
		set.add("kalyan1");//String---->Object
		set.add("manish3");
		set.add("babrak4"); //String---->Object
		set.add("kumer5");
		
		System.out.println(set);
		
		for(String s:set) {
			System.out.println(s);
		}

	}

}
