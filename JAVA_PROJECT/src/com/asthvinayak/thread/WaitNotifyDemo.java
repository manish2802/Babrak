package com.asthvinayak.thread;

public class WaitNotifyDemo {

	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");

		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();//T
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed...");
	}

	
	
	
	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed... ");
		notify();
	}

	public static void main(String args[]){  
		final WaitNotifyDemo c=new WaitNotifyDemo();  
		
		
		
		new Thread(){  //Thread-1
		public void run(){c.withdraw(15000);}  
		}.start();  
		
		
		
		
		
		new Thread(){  //Thread-2
		public void run(){c.deposit(10000);}  
		}.start(); 
	}
}
