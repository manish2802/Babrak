
package com.asthvinayak.exception;

import com.asthvinayak.classs.Student;

public class RuntTimeExceptionDemo {

	public static void main(String[] args) {

		try {

			String str = null;
			System.out.println("Before Exception i  will print ");// will be executed

			System.out.println(str.equals("manish"));// program has been terminted. //java.lang.NullPointerException

			System.out.println("After Exception i will not print  beacase line 16 has exception"); // will not not
																									// executed

		} catch (Exception e) {
			//e.printStackTrace();//java.lang.NullPointerException
			//at com.asthvinayak.exception.RuntTimeExceptionDemo.main(RuntTimeExceptionDemo.java:17)
			System.out.println(e.getMessage());
		}
	}
}
