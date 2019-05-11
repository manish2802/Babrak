package com.asthvinayak;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class WheatherGenericServlet extends GenericServlet {

	static int count;


	
	@Override
	public void service(ServletRequest arg0, ServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>" + count++ + "</h1>");

	}

}
