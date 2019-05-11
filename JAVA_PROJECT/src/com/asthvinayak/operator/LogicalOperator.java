package com.asthvinayak.operator;

public class LogicalOperator {

	public static void main(String[] args) {
		// logic oprends
		
		int a=5,b=6;
		if((a>b)&&(b>4)) {    //both the condition should be true
		System.out.println("AND");
		}
		
		if((a>b)||(b>4)) {    //any one of condition should be true
			System.out.println("OR");
		}

	}

}
