
package com.asthvinayak.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.asthvinayak.constant.QueryConstant;
import com.asthvinayak.model.Student;
import com.asthvinayak.util.DBUtil;

public class StudentDAO {

	public static StudentDAO INSTANCE = null;
	private StudentDAO() { /// private constractor role first

	}
	public static synchronized StudentDAO getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new StudentDAO();
			return INSTANCE;
		}
		return INSTANCE;
	    }
	
	public void insertInfo(Student student) {

		Connection conn;
		try {
			conn = DBUtil.getConnection();
			PreparedStatement pStmt = conn.prepareStatement(QueryConstant.INSERT_STUDENT);
			pStmt.setString(1, student.getEnrollNo());
			pStmt.setString(2, student.getFirstName());
			pStmt.setString(3, student.getLastName());
			pStmt.setString(4, student.getPhoneNo());
			pStmt.setString(5, student.getCity());
			// Pass the query
			int i = pStmt.executeUpdate();
			System.out.println(i + " inserted succesfully");

			DBUtil.closeConnection(conn, pStmt);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	    }
	public List<Student> getAllStudentInfo() {

		Connection conn;
		PreparedStatement pStmt;
		List<Student> listStudent = new ArrayList<Student>();
		try {
			conn = DBUtil.getConnection();
			pStmt = conn.prepareStatement(QueryConstant.GET_ALL_STUDENT);

			// Pass the query
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {// cursor moving

				String enrollNo = rs.getString("ENROLL_NO");
				String firstName = rs.getString("FIRST_NAME");
				String lastname = rs.getString("LAST_NAME");
				String phoneNo = rs.getString("PHONE_NO");
				String city = rs.getString("CITY");
				Student student = new Student(enrollNo, firstName, lastname, phoneNo,city);
				listStudent.add(student);
			}
			DBUtil.closeConnection(conn, pStmt, rs);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listStudent;
	}
	public Student getStudentInfo(String enrollNo2) {

		Connection conn;
		Student student = null;
		try {
			conn = DBUtil.getConnection();
			PreparedStatement pStmt = conn.prepareStatement(QueryConstant.GET_STUDENT);
			pStmt.setString(1, enrollNo2);
			// Pass the query
			ResultSet rs = pStmt.executeQuery();
			rs.next();
			String enrollNo = rs.getString("ENROLL_NO");
			String firstName = rs.getString("FIRST_NAME");
			String lastname = rs.getString("LAST_NAME");
			String phoneNo = rs.getString("PHONE_NO");
			String city = rs.getString("CITY");

			student = new Student(enrollNo, firstName, lastname, phoneNo,city);
			System.out.println(enrollNo + " " + firstName + " " + lastname + " " + phoneNo);
			DBUtil.closeConnection(conn, pStmt, rs);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
	}

}
