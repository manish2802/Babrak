package com.asthvinayak.exception;

import java.io.IOException;

public class ThrowThrowsDemo {

	void show(String name) { // define

		if (name == null) {
			throw new NullPointerException(); // Unchecked Exception
		}
		System.out.println(name);

	}

	void readFile(String path) throws IOException { // define  throws for indecation
		if (path == null) {
			throw new IOException(); // Checked Exception
		}
		System.out.println(path);

	}

	void display(String str) throws IOException {
		System.out.println("display");
		readFile(str); // caller
	}

	void toShow(String str) throws IOException {
		System.out.println("toShow");
		
			display(str); // caller
		
	}

	public static void main(String[] args) {

		ThrowThrowsDemo td = new ThrowThrowsDemo();
		System.out.println("start ");
		td.show("maish"); // using

		try {
			td.toShow(null); // caller
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

		System.out.println("End");

	}

}
