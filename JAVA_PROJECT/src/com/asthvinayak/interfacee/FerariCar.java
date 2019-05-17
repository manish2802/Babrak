package com.asthvinayak.interfacee;

public class FerariCar implements  Car{  //Inside the server

	@Override
	public void  gear(int name) {
		System.out.println("Ferari have 5 gear");
		
	}

	@Override
	public void speed(int name) {
		System.out.println("200 mail per houre ");
		
	}

	@Override
	public void allFeature() {
		System.out.println("has all grate feature");
		
	}

	@Override
	public String students(String name) {
		System.out.println("babrak");
		return name;
	}

	
	public static void main(String[] args) {
		
		
		
		Car c=new FerariCar();
		c.gear(5);
	}
 
	

}
