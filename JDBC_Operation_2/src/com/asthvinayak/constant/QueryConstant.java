package com.asthvinayak.constant;

public class QueryConstant {

	public static String INSERT_STUDENT = new StringBuilder("INSERT INTO  STUDENT VALUES(?,?,?,?").toString();

	public static String GET_STUDENT = new StringBuilder("SELECT * FROM STUDENT WHERE ENROLL_NO=?").toString();

	public static String GET_ALL_STUDENT = new StringBuilder("SELECT * FROM STUDENT").toString();

}
