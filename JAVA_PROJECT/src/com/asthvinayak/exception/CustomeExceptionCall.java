package com.asthvinayak.exception;

public class CustomeExceptionCall {

	public static void getSpeed(int speed) throws ManishException { // define

		if (speed > 100 && speed <= 200) {
			throw new ManishException("More Than 100 in not allowed...it is denegerous");
		}

		if (speed > 200) {
			throw new ManishException("More Than 100 in not allowed...it is  too denegerous");
		}

	}

	public static void controlSpeed(int speed) {
		if (speed < 100) {
			throw new BabarakException("it is  too good");
		}

	}

	public static void main(String... k) {

		/*
		 * try { getSpeed(201); } catch (ManishException e) { e.printStackTrace(); }
		 */

		try {
			controlSpeed(99);
		} catch (BabarakException e) {
			e.printStackTrace();
		}

	}

}
