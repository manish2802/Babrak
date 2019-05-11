package com.asthvinayak;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/weather")
public class WheartherHttpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("first_name"); // get parameter value that is comes by client(i.e. 																// browser)
		String lastName = request.getParameter("last_name");
		String middleName = request.getParameter("middleName");
		System.out.println(firstName + "  " + lastName + middleName);

		response.setContentType("text/html"); // MIME type
		PrintWriter pw = response.getWriter(); // HTML PAGE Will be prepare
		pw.write("<h1>" + firstName + "</h1>");
		pw.write("<h1>" + lastName + "</h1>");
		pw.write("<h2>" + middleName + "<h2>");
		pw.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
