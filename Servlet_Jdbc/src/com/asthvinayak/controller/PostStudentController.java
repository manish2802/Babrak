
package com.asthvinayak.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.asthvinayak.dao.StudentDAO;
import com.asthvinayak.model.Student;

@WebServlet("/student-reg")
public class PostStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public PostStudentController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Get the request
		String firstName = request.getParameter("first_name"); // get parameter value that is comes by client(i.e. 																// browser)
		String lastName = request.getParameter("last_name");
		String phoneNo = request.getParameter("phone_no");
		String city = request.getParameter("city");
		
		System.out.println(firstName + "  " + lastName +"  "+phoneNo+"  "+city );
		StudentDAO sd= StudentDAO.getInstance();
		sd.insertInfo(new Student("1006",firstName,lastName,phoneNo,city));

		//Perpare the respone object and object will be sent to the client
		response.setContentType("text/html"); // MIME type
		PrintWriter pw = response.getWriter(); // HTML PAGE Will be prepare
		pw.write("<h1>" + firstName + "</h1>");
		pw.write("<h1>" + lastName + "</h1>");
		pw.write("<h2>" + phoneNo + "<h2>");
		pw.write("<h2>" + city + "<h2>");
		pw.close();	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
    }
