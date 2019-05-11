package com.asthvinayak.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.asthvinayak.collection.list.Employee;

public class HashMapDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setName("Manishj");
		e1.setSalry("50000");

		Employee e2 = new Employee();
		e2.setName("barak");
		e2.setSalry("50000");

		Map hm = new HashMap();

		hm.put("100001", e1);
		hm.put("100002", e2);

		/*
		 * hm.replace("100001", "abc"); hm.remove("100001");
		 */

		System.out.println(hm);

		Set s = hm.entrySet(); // Convert into Set
		Iterator itr = s.iterator();
		while (itr.hasNext()) {

			Map.Entry m = (Map.Entry) itr.next(); /// nested
			System.out.println(m.getKey() + " ==================  " + m.getValue());
		}

		for (Object m : s) {

			Map.Entry mm = (Map.Entry) m; // explicit casting
			System.out.println(mm.getKey() + " ==================  " + mm.getValue());
		}

		

	}

}
