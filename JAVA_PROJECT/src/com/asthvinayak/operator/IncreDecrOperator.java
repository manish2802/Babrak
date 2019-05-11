package com.asthvinayak.operator;

public class IncreDecrOperator {

	public static void main(String... k) {

		int a = 5;

		// a++; //post increment //6
		// ++a; //pre increment //7
		// System.out.println(a);

      //		int b=++a;     //first a will be incremented after that it will be assignded to b  because of pre increment.
      //		System.out.println(b);	

		// int b=a++; //7 assigned to b first after that it will be incremented because
		// of post increment.
        //		System.out.println(b);
		
		
//		int b=a++ + ++a;  
//		   // 5 + ++6                     a=6
//		   // 5  +  7
//		System.out.println(b);   
		
		
		int b=a-- + --a;  
		   // 5 + --4                     a=4
		   // 5  +  3
		System.out.println(b);  

	}

}
