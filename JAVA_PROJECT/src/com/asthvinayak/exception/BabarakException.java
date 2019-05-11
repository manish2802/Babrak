package com.asthvinayak.exception;

public class BabarakException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	String message;

	public BabarakException(String msg) {

		super(msg);

	}

}
