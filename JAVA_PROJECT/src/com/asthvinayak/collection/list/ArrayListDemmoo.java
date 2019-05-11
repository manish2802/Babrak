package com.asthvinayak.collection.list;

import java.util.ArrayList;

public class ArrayListDemmoo {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		
		list.add(10);   //int------>Integer--->Object
		list.add("abc"); //String---->Object
		list.add("abc");
		list.set(0, 20);
		
		
		
		System.out.println(list);
		
		
		
		for (Object j : list) { // for each
			System.out.println(j);
			
		}
	    }
        }
