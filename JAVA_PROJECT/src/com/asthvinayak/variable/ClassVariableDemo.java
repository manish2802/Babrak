package com.asthvinayak.variable;

public class ClassVariableDemo {


	static String name="manish";  //memory has been created only one time
	static int age=28;

	

	public static void main(String[] args) {
		
		System.out.println(ClassVariableDemo.name+" "+ClassVariableDemo.age);
		
		
		// TODO Auto-generated method stub
		ClassVariableDemo iv1 = new ClassVariableDemo();   
		System.out.println(iv1.name + "   " + iv1.age);
		iv1.name="babrak";

		ClassVariableDemo iv2 = new ClassVariableDemo();  
		System.out.println(iv2.name + "   " + iv2.age);

		ClassVariableDemo iv3 = new ClassVariableDemo();    
		System.out.println(iv3.name + "   " + iv3.age);

	}

}
