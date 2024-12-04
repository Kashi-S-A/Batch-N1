package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/url")
public class TestServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Hi this is generic Servlet");
		
		PrintWriter pw=res.getWriter();
		pw.print("<html><body>");
		pw.print("<h1>Hi TestServlet is triggered</h1>");
		pw.print("</body></html>");
		
	}

}
