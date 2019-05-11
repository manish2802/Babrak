package com.asthvinayak.thread;

public class SynchronizedDemo {

	// T1
	public synchronized void m(int n) { // lock to object to stop the multipul thrads calling at the same time to same bunis

		// T2

		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}
