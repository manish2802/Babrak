
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

@WebServlet("/get-rest-all-student")
public class RestGetAllStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RestGetAllStudentController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		StudentDAO sd = StudentDAO.getInstance();
		List<Student> list = sd.getAllStudentInfo();
		// Perpare the respone object and object will be sent to the client
		response.setContentType("text/json"); // MIME type
		PrintWriter pw = response.getWriter(); // HTML PAGE Will be prepare

		// pw.write("[{"+"\""+"id"+"\""+":"+"101"+","+"\""+"name"+"\""+":"+"\""+"manish"+"\""+"}]");
		int count = 1;
		pw.write("[");
		for (Student s : list) {
			pw.write("{");
			pw.write("\"" + "enrollNo" + "\"" + ":" + "\"" + s.getEnrollNo() + "\"" + ",");
			pw.write("\"" + "firstName" + "\"" + ":" + "\"" + s.getFirstName() + "\"" + ",");
			pw.write("\"" + "lastName" + "\"" + ":" + "\"" + s.getLastName() + "\"" + ",");
			pw.write("\"" + "phoneNo" + "\"" + ":" + "\"" + s.getPhoneNo() + "\"" + ",");
			pw.write("\"" + "city" + "\"" + ":" + "\"" + s.getCity() + "\"");
			
			if (count == list.size()) {
				pw.write("}");
			} else {
				pw.write("},");
			}
			++count;
		}
		pw.write("]");
		System.out.println(pw.toString());

		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
