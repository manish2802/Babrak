package com.asthvinayak.variable;

public class VariableDemo {

	static String collegeName="cubic"; // class variable (method area)
	static String schoolName="carrs";
	
	String studentName; // Instance variable (Heap Area)

	VariableDemo() {
		int ammout; // local variable
	}

	void deposite() {
		final   int ammout; // local variable (take memory in stack area)
		System.out.println(studentName);

	}

	public static void main(String... k) {
		int i=1;
		System.out.println(i);
		
		System.out.println(VariableDemo.collegeName);
		System.out.println(VariableDemo.schoolName);
		
		
		VariableDemo vm=new VariableDemo();
		vm.deposite();
	}

}
