package com.asthvinayak.classs;

public class ClassDemo {

	
;
	static String collegeName;

	ClassDemo() {

	}
	
	void show() {
		System.out.println("show");
	}
	
	void formWhere() {
		System.out.println("INDIA");
	}

	public static void main(String... k) {

		Student s = new Student();
		// memory has been initialized(default value)
	
		//instantiate object
		s.setName("babark");
		s.setAge(27);
		s.setEmail("abc@gmail.com");
		
		
		//initialized+instantiate
		Student s2 = new Student("babark","abc@gmail.com",27);  //this
		Student s1 = new Student("manish","abc@gmail.com");  //this
		System.out.println(s2.toString());
		System.out.println(s1.toString());
		
		
		//call two pramiter consturactor 
		Student s3 = new Student ("kumar", "babrak@yahoo.com");
		System.out.println(s3.toString());
		

	}

}
