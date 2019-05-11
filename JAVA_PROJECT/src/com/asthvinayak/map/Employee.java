package com.asthvinayak.map;

  public class Employee {
 
	   private String name;
	   private String salry;
	
	
	   
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSalry() {
		return salry;
	}
	public void setSalry(String salry) {
		this.salry = salry;
	}
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", salry=" + salry + "]";
	}
	
	
	
}
