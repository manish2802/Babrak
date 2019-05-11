package com.asthvinayak.singleton;

public class Singleton {

	static Singleton INSTANCE = null;

	// nobody can not create the object outside the class with the help of new
	// keyword.
	private Singleton() { /// private constractor role first 

	}
     // by helping of factory method we can create the object
	// Get always same object
	public static synchronized Singleton getInstance() {

		if (INSTANCE == null) {
			//T1 //T2
			INSTANCE = new Singleton();
			return INSTANCE;
		}
		return INSTANCE;
	}
	
	
	
	
	
	

}
