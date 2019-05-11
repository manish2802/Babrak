package com.asthvinayak.method;

public  class NonStaticMethodDemo {
	
	

	//// String return type //// argument name lastname
	String fullName(String name, String lastName) { // static
		return "Hi " + "This is " + name + " " + lastName;

	}
	
	String fullName(String name, String lastName,String middle) { 
		return "Hi " + "This is " + name + " " + lastName+" "+middle;

	}

	public static void main(String[] args) {
		NonStaticMethodDemo s1 = new NonStaticMethodDemo();
		System.out.println(s1.fullName("Manish", "Verma"));   

		NonStaticMethodDemo s2 = new NonStaticMethodDemo();
		System.out.println(s2.fullName("khan", "kkkkkk"));

		NonStaticMethodDemo s3 = new NonStaticMethodDemo();
		System.out.println(s3.fullName("jjjjj", "lllllll"));
		System.out.println(s3.fullName("jjjjj", "lllllll","llklk"));
		
		System.out.println(Thread.currentThread().getName());

		
	}
	
	

}
