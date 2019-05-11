package com.asthvinayak.casting;

public class Child extends Parent {
	
	
	
	
	public static void main(String[] args) {
		
		 Parent p=new Child();  //Upcasating
		 
		 
		 
		 Object o=new Child();
		 
		 Child c=(Child)new Parent(); //Downcasting	  explict	 
		 
		 Child c2=(Child)o;
		
	}

}
