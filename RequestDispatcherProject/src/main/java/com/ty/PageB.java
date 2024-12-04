package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pageb")
public class PageB extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uName = (String) req.getAttribute("un");
		
		System.out.println("Welcome to PageB "+uName);

		
		PrintWriter pw=resp.getWriter();
		pw.print("<html><body>");
		pw.print("<h1>Welcome to PageB  "+uName+"</h1>");
		pw.print("</body></html>");
	}
}
