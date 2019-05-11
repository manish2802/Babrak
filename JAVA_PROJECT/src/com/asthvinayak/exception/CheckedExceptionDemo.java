package com.asthvinayak.exception;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		

		try {      		
			
			 LineNumberReader reader  = new LineNumberReader(new FileReader("C://abc.txt"));//terminted//Exception object created by jvm
			    while (reader.readLine() != null) {}
			    reader.close();		
			
		} catch (IOException e) { //object catch by catch block
			System.out.println(e.getMessage());
		}
		
		
	}

}
