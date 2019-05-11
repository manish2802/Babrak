package com.asthvinayak.thread;
public class MainThread {
	

	

	public static void main(String...k) {//main
		
		
		System.out.println(Thread.currentThread().getName());
		
		SynchronizedDemo sd=new SynchronizedDemo();
		
		
		
		
		ThreadDemo1 t=new ThreadDemo1(sd);////////seperate program(Thread-1)
		Thread tt=new Thread(t);
		tt.setName("maish");
		tt.start();
		
		
		
		
		
		ThreadDemo2 t2=new ThreadDemo2(sd);////////seperate program(Thread-2)
		Thread tt2=new Thread(t2);
		tt2.setName("babrak");
		tt2.start();
	}

}
