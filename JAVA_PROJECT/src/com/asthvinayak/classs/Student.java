package com.asthvinayak.classs;

public class Student {

	private String name;
	private String email;
	private int age;

	// Default constructor
	public Student() {
		this.name = null;
		this.email = null;
		this.age = 0;
	}

	//// two pramiter contructor
	public Student(String name, String email) {
		this.name = name;
		this.email = email;

	}

	// Object will intaniaeted(intialized+taking the value)
	public Student(String name, String email, int age) {

		this.name = name;
		this.email = email;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", age=" + age + "]";
	}

}
