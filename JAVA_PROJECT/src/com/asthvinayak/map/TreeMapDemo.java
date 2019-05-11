package com.asthvinayak.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.asthvinayak.collection.list.Employee;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		e1.setName("Manishj");
		e1.setSalry("50000");

		Employee e2 = new Employee();
		e2.setName("barak");
		e2.setSalry("50000");

		Map<Integer,Employee> hm = new TreeMap<Integer,Employee>();//// treemap or treeset we using to maintence the order like  2 4  1 3 === 1 2 3 4
		hm.put(100005, e2);
		hm.put(100001, e1);
		hm.put(100002, e2);



		System.out.println(hm);

		Set s = hm.entrySet(); // Convert into Set
		for (Object m : s) {

			Map.Entry mm = (Map.Entry) m; // explicit casting
			System.out.println(mm.getKey() + " ==================  " + mm.getValue());
		}

	}

}
