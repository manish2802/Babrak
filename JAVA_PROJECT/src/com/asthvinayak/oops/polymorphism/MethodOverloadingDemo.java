package com.asthvinayak.oops.polymorphism;

public class MethodOverloadingDemo {
	
	

	int add(int a, int b) {
		int c = a + b;
		System.out.println(c);
		return c;
	}

	int add(int a, int b, int c) {

		int d = a + b + c;
		System.out.println(d);
		return d;
	}
	

	double add(double a, double b) {
		System.out.println(a + b);
		return a + b;
	}

	public static void main(String[] args) {

		MethodOverloadingDemo md = new MethodOverloadingDemo();
		md.add(20, 30);
		md.add(10, 10, 30);
		md.add(10.10, 10.10);

	}

}
