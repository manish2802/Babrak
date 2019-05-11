package com.asthvinayak.string;

public class StringDemo {

	public static void main(String[] args) {
		//// String is immutable because when we change anything in the string.it will always create new memory.
		
		String s1="manish";  //constant pool
		String s3="manish";
		String s4="manish";
		String s5="manish";
		
		 String s2= new String("manish"); //  constant pool as well as heap area
		 String s6= new String("manish"); // heap area
		 
		 String S7=s1+" verma";// manish verma (new memory) bacause string is immuatable
	}

}
