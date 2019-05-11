package com.asthvinayak.oops.polymorphism;

public class MethodOverloadingDemo2 {
	
  static   String print (String name , String nikname) {
		System.out.println(name+nikname);
		return "name+nikname";
		
	}
	
	
	static   void  print (int  number  , int id) {
		System.out.println("first");
		System.out.println(number+id);
	}
	
	
	
	static   void  print (long  number  , long id) {
		System.out.println("scoend");
		System.out.println(number+id);
	}
	
   

     static   float  print (float  salary  , float  money) {
    	 System.out.println("third");
	      System.out.println(salary+money);
	      return salary+money;
  
   }
   
    public static void main(String[] args) {
	
    	MethodOverloadingDemo2 md =new MethodOverloadingDemo2();
    	md.print("kumar", "ranjeth");
    	md.print(4, 5);
    	md.print(475896.01f, 586935555555f);
    	
    	
	   
	   
	   
   }
   
   }
    