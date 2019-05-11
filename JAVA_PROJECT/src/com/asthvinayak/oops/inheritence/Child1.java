package com.asthvinayak.oops.inheritence;

public class Child1 extends Parent { //sub class
	
	

	
	public static void main(String...k) {
		
		
		
		Parent p=new Parent(); ///HAS-A
		p.getCurrentAmmmount();
		
		Child1 child=new Child1();////has A
		child.getCurrentAmmmount();
		
		Child2 child2=new Child2();////has A
		child2.getCurrentAmmmount();

	}
	
	
	
}
