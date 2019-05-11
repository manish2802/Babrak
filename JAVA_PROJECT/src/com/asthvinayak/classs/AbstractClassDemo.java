package com.asthvinayak.classs;

public abstract class AbstractClassDemo {
	
	abstract void gear(int name);    ///// this is one  abstract Method 

	abstract void speed(int name);   ///// this is one  abstract Method 

	abstract void allFeature();      ///// this is one  abstract Method 
	
	
	public abstract void  employeeName (String employeeName);
	
	public abstract void  studentName  (String studentName);
	
	public abstract void  informationName  (String informationName);
	
	
	
	
	
	
	
	void show() {               //Concrete method   sample method 
		System.out.println("this is the show method");
	}
	
	void formWhere() {
		System.out.println(" iam from INDIA");
	}
	

}


