package com.asthvinayak;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pdf")
public class WheartherHttpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static int count = 0;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {

		response.setContentType("application/msword");

		String pdfFileName = "coreJava"+ "_" + count+".docx";
		String contextPath = getServletContext().getRealPath(File.separator);
		File pdfFile = new File(contextPath + pdfFileName);

		response.addHeader("Content-Disposition", "attachment; filename=" + pdfFileName );
		response.setContentLength((int) pdfFile.length());

		try {
			@SuppressWarnings("resource")
			FileInputStream fileInputStream = new FileInputStream(pdfFile);
			OutputStream responseOutputStream;
			responseOutputStream = response.getOutputStream();

			int bytes;
			while ((bytes = fileInputStream.read()) != -1) {
				responseOutputStream.write(bytes);
			}
		} catch (Exception fn) {
			System.out.println(fn);
		}
		count++;

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
