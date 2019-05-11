package com.asthvinayak.variable;

public class InstanceVariableDemo {

	public String name;
	public int age;

	public InstanceVariableDemo(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public static void main(String[] args) {
		
		InstanceVariableDemo iv1 = new InstanceVariableDemo("manish", 28);   //name,age(memory created)
		System.out.println(iv1.name + "   " + iv1.age);
	
		InstanceVariableDemo iv2 = new InstanceVariableDemo("Babarak", 28);  //name,age(memory created)
		System.out.println(iv2.name + "   " + iv2.age);

		InstanceVariableDemo iv3 = new InstanceVariableDemo("shiv", 27);     //name,age(memory created)
		System.out.println(iv3.name + "   " + iv3.age);

	}

}
