package com.asthvinayak.method;

public class StaticMethodDemo {
	
	

	//// String return type //// argument name lastname
	static String fullName(String name, String lastName) { // static
		return "Hi " + "This is " + name + " " + lastName;

	}

	public static void main(String[] args) {
		
		    /// call by refrence veriable 
		//StaticMethodDemo s1=new StaticMethodDemo();
		//System.out.println(s1.fullName("Manish", "Verma"));
	
		
		//StaticMethodDemo s2=new StaticMethodDemo();
		//System.out.println(s2.fullName("khan", "kkkkkk"));
		
		//StaticMethodDemo s3=new StaticMethodDemo();
		//System.out.println(s3.fullName("jjjjj", "lllllll"));
		
		//Right approach
		System.out.println(StaticMethodDemo.fullName("Manish", "Verma"));
		System.out.println(StaticMethodDemo.fullName("khan", "kkkkkk"));
		System.out.println(fullName("jjjjj", "lllllll"));
		

	}

}
