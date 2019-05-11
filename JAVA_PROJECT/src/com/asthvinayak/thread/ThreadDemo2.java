package com.asthvinayak.thread;

public class ThreadDemo2 implements Runnable {

	SynchronizedDemo sd;
	public ThreadDemo2(SynchronizedDemo sd) {
		this.sd = sd;

	}

	@Override
	public void run() {

		sd.m(10);

	}

}
