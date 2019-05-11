package com.asthvinayak.oops.polymorphism;

public class ParentInterfaceImpl implements ParentInterface{

	@Override
	public void show() {
		System.out.println("show impl");
				
	}
	
	public static void main(String[] args) {
		
		ParentInterface pi=new ParentInterfaceImpl();
		pi.show();
	}
	
	
	

}
