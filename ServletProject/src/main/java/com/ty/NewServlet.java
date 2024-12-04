package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/new")
public class NewServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Http Servlet is triggered");
		
		PrintWriter pw=resp.getWriter();
		pw.print("<html><body>");
		pw.print("<h1>This is New HttpServlet </h1>");
		pw.print("</body></html>");
	}
}
