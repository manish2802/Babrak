package com.asthvinayak.collection;

public class ArrayDemo {
	
	
	public static void main(String arg[]) {
		
		int[] i=new int[10];
		i[0]=10;
		i[1]=20;
		i[2]=10;
		i[3]=20;
		i[4]=10;
		i[5]=20;
		i[6]=10;
		i[7]=20;
		i[8]=20;
		i[9]=20;
	
		for(int j:i) {
			System.out.println(j);
		}
		
		
		Information[] in= new Information[2];
		
		Information in1=new Information();
		in1.setName("Manishj");
		in1.setSalry("50000");
		in[0]=in1;
		
		Information in2=new Information();
		in2.setName("barak");
		in2.setSalry("50000");
		in[1]=in2;
		
		for(Information j:in) {
			System.out.println(j.getName()+" "+j.getSalry());
		}
		
		
	   }

       }
