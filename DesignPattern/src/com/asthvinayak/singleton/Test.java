package com.asthvinayak.singleton;

public class Test {

	public static void main(String[] args) {
		//// Singleton= means only one object will be crate at the time 
		
		Singleton s1=Singleton.getInstance();		
		System.out.println(s1.hashCode());
		
		Singleton s2=Singleton.getInstance();
		System.out.println(s2.hashCode());


	}

}
