package com.asthvinayak;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class WheartherServlet implements Servlet {

	static int count;
	

	public void destroy() {
		System.out.println(" i am destroy method ");
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;

	}

	@Override
	public String getServletInfo() {
		return null;

	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("init");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse response) throws ServletException, IOException {
		System.out.println("i am the service method ");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>" + count++ + "</h1>");
		

	}

}
