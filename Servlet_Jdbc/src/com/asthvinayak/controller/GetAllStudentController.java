
package com.asthvinayak.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.asthvinayak.dao.StudentDAO;
import com.asthvinayak.model.Student;

@WebServlet("/get-all-student")
public class GetAllStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public GetAllStudentController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		StudentDAO sd = StudentDAO.getInstance();
		List<Student> list = sd.getAllStudentInfo();
		
		// Perpare the respone object and object will be sent to the client
		response.setContentType("text/html"); // MIME type
		PrintWriter pw = response.getWriter(); // HTML PAGE Will be prepare
		pw.write("<html><table style=\"width:30%\"><tr>");
		pw.write("<th> FIRSTNAME </th>");
		pw.write("<th> LASTNAME </th>");
		pw.write("<th> PHONENO</th>");
		pw.write("<th> CITY </th><tr>");

		for (Student stu : list) {
			pw.write("<tr><td>" + stu.getFirstName() + "</td>");
			pw.write("<td>" + stu.getLastName() + " </td>");
			pw.write("<td>" + stu.getPhoneNo() + "</td>");
			pw.write("<td>" + stu.getCity() + " </td></tr>");
		}
		pw.write("</table></html>");
		pw.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
