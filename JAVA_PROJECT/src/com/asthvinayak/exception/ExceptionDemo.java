
package com.asthvinayak.exception;

public class ExceptionDemo {

	public static void main(String[] args) throws InterruptedException  {
		Integer i = 1234;
		int a[] = { 10, 20 };
		
		System.out.println("Before Exception Occure");// will be executed

		Thread.sleep(5000);
		System.out.println(a[2]);
		System.out.println(i / 0);// program has been terminted. //java.lang.ArithmeticException

		System.out.println("After Exception Occure"); // will not not executed

	}

}
