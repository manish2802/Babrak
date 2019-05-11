package com.asthvinayak.thread;

public class ThreadDemo1 implements Runnable {

	SynchronizedDemo sd;
	public ThreadDemo1(SynchronizedDemo sd) {
		this.sd = sd;

	}

	@Override
	public void run() {

		sd.m(5);

	}

}
