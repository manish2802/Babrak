package com.asthvinayak.oops.inheritence;

public class IImpDemo implements IParent {

	@Override
	public void depositeAmmount() {
		// TODO Auto-generated method stub
		System.out.println("1000");

	}

	@Override
	public void getAmmount() {
		// TODO Auto-generated method stub
		System.out.println("700");
	}

	public static void main(String...k) {
		
		
		IImpDemo id=new IImpDemo();
		id.depositeAmmount();
		
		IImpDemo id2=new IImpDemo();  //Dynamic ploymorphism
		id2.depositeAmmount();
		
		
		
		
		
		
	}


		
	
}
