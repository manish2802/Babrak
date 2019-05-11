package com.asthvinayak.oops.polymorphism;

public class MethodOverRidingChild extends MethodOverRidingParent {
	

	
	public void show() { //run time///redefine
		System.out.println("i am show method of child class");
	}
	

	public static void main(String... k) {
		
		//Parent
		MethodOverRidingParent mp=new MethodOverRidingParent();
		mp.show();
		
		//Child  run time
		MethodOverRidingChild mo=new MethodOverRidingChild();
		mo.show();
		
		
		///////dynamic polymorphism (Parent-Child) the object will create at run time 
		MethodOverRidingParent mor=new MethodOverRidingChild();
		mor.show(); //Run time control ump into the implemented method
		
		
	

	}

}
