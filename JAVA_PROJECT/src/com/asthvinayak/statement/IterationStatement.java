package com.asthvinayak.statement;

import java.util.ArrayList;

public class IterationStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;

		// always check condition

		while (a <= 10) {
			System.out.println(a++); // 5 6 7 8 9 10 }

			while (a++ <= 10) {
				System.out.println(a); // 6 7 8

			}

			// for execution of first time is not checked condition but after it will check
			// for every execution.

			do {
				System.out.println(a++);
			} while (a <= 10);

			// For loop
			for (int i = 1; i <= 10; ++i) { // 1 2 3 ...10 System.out.println(i);

			}

			// Nested For Loop
			for (int i = 1; i <= 10; ++i) { // 1 //2 //3
				System.out.println("Outer: " + i);
				for (int j = 1; j <= 10; ++j) { // 1 2 3 ...10
					System.out.println(j);

				}

			}

			// for each loop (itrating the collection/Array)
			String[] str = { "abc", "xyz", "JJJ" };
			for (String s : str) {
				System.out.println(s);
				
			}
			
			
			
			

			ArrayList<Integer> arrL = new ArrayList<Integer>();
			arrL.add(1);
			arrL.add(2);
			arrL.add(3);
			arrL.add(4);
              System.out.println("forEachloop by  lamda exmpression");
            
              arrL.forEach(n -> System.out.println(n));
			

		}

	}

}
