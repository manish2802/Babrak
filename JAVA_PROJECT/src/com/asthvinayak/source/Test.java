package com.asthvinayak.source;

public class Test {

	public static void main(String[] args) {

		Student student=new Student();   
		student.setName("Manish");  //6 byte
		student.setAge(27);         ///4 byte(fiexed)
		student.setEmail("abc@gmail.com");   //12 byte      Total:22 byte
		
		
		Student student2=new Student();
			
		student2.setName("babark");
		student2.setAge(27);
		student2.setEmail("abc@gmail.com");
		
		Student student3=new Student();
		student3.setName("babark");
		student3.setAge(27);
		student3.setEmail("abc@gmail.com");
	
		

	}

	
}


