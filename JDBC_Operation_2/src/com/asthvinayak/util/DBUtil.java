package com.asthvinayak.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {

	static {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	   }

	/**
	 * Fot getting the connection
	 * 
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "manish", "manish");
		System.out.println("Database connected successfully");
		return conn;
	}

	/**
	 * close the connection
	 * 
	 * @param conn
	 * @param pStmt
	 * @throws SQLException
	 */
	public static void closeConnection(Connection conn, PreparedStatement pStmt) throws SQLException {
		if (conn != null) {
			conn.close();
		}
		if (pStmt != null) {
			pStmt.close();
		}
	}

	/**
	 * 
	 * @param conn
	 * @param pStmt
	 * @param rs
	 * @throws SQLException
	 */
	public static void closeConnection(Connection conn, PreparedStatement pStmt, ResultSet rs) throws SQLException {
		if (conn != null) {
			conn.close();
		}
		if (pStmt != null) {
			pStmt.close();
		}
		if (rs != null) {
			rs.close();
		}
	}

}
