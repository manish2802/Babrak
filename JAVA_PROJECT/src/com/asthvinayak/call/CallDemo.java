package com.asthvinayak.call;

public class CallDemo/*IOException*/ extends SuperDemo/*Exception*/ {
	
	
	public CallDemo() {
		//super();
		System.out.println("CallDemo constructor");
	}
	

	void show() { // call by caller
		System.out.println("show");
	}

	void showAnother() { // call by caller
		this.show();  // acess in same class object
		super.showSuper();// access in parent class object
		System.out.println("showAnother");
	}

	static void display() { // call by caller
		System.out.println("display");
	}

	public static void main(String... k) { // call by jvm
		CallDemo cd=new CallDemo();
		cd.showAnother();
		
		CallDemo cd1=new CallDemo();
		cd1.showAnother();
		
		CallDemo.display();
		
		
		

	}

}
