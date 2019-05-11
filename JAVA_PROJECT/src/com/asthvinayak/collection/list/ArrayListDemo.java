package com.asthvinayak.collection.list;

import java.util.ArrayList;

public class ArrayListDemo { /////ArrayList is more  foster for  retrifing the data 
	
	
	public static void main(String[] args) {
		
		
		
		Employee e1=new Employee();
		e1.setName("Manishj");
		e1.setSalry("50000");
		
		Employee e2=new Employee();
		e2.setName("barak");
		e2.setSalry("50000");
		
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		
		
		for(Employee j:list) {  //for each
			System.out.println(j.getName()+" "+j.getSalry());
		}
		
		
	}
	

}
