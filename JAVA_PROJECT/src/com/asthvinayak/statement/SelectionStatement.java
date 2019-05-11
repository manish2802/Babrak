package com.asthvinayak.statement;

public class SelectionStatement {

	public static void main(String[] args) {

		int a = 5, b = 3;
		if ("manish".equals("jjj")) { // if condtion only
			System.out.println(a++);
		}

		if (a > b) { // if....else
			System.out.println("If");
		} else {
			System.out.println("else");
		}

		int number = -6; // multiple if else condition

		if (number > 0) {
			System.out.println("Positive Number");
		} else if (number < 0) {
			System.out.println("Negative Number");
		} else {
			System.out.println("Zero");
		}

		int x = 30, y = 20;
		if (x > 20) { // Nested condition
			if (y < 50) {
				System.out.println("Hi..");
			} else {
				System.out.println("byy");
			}

		}

		int z = 50;    //switch statement
		int sw = 5;
		switch (sw) {
		case 1:
			System.out.println("CASE 1");
			break;
		case 2:
			System.out.println("CASE 2");
			break;
		case 3:
			System.out.println("CASE 3");
			break;
		default:
			System.out.println("i dont have anything");

		}

	}

}
