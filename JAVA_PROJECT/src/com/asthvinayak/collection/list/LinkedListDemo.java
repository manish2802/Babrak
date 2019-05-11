package com.asthvinayak.collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo { ///// linkedlist is slow for the retrifing the  data  but foster for the inserting  or deleting 
		
	public static void main(String[] args) {
		
		
		Employee e1=new Employee();
		e1.setName("Manishj");
		e1.setSalry("50000");
		
		Employee e2=new Employee();
		e2.setName("barak");
		e2.setSalry("50000");
		
		
		LinkedList<Employee> list=new LinkedList<Employee>();
		list.add(e1);
		list.add(e2);
		
		
		
		/*for(int i=0;i<list.size();++i) {  //for loop base on  index
			System.out.println(list.get(i).getName()+" "+list.get(i).getSalry());
		}
		
		
		for(Employee j:list) {  //for each //intialzation //increment implicit
			System.out.println(j.getName()+" "+j.getSalry());
		}
		
		Iterator itr=  list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		list.forEach(n -> System.out.println(n)); /// lamda experision 1.8 jdk
		
		
		
	}

}
