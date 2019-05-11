package com.asthvinayak.oops.inheritence;

public class ChildAbstractClassImpl extends ParentAbstractClassDemo {
	
	
	
	@Override
	void gear(int name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void speed(int name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void allFeature() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String...k) {
		
		//AbstractClassDemo cd=new AbstractClassDemo(); //HAS-A is not being worked here
		ChildAbstractClassImpl ac=new ChildAbstractClassImpl();
		ac.show();
		ac.gear(10);
		
	}

	

}
