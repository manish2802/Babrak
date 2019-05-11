package com.asthvinayak.encpuslation;

public class Encapsulation {

	private int fer;
	private int age;
	private int gear;

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		if (gear > 4) {
			this.gear = 4;
		} else {
			this.gear = gear;
		}

	}

	public int getFer() {
		return fer;
	}

	public void setFer(int fer) {
		this.fer = fer;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 18) {
		}

	}

}
