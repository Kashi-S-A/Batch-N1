package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pagea")
public class PageA extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("uname");

		System.out.println("Welcome to PageA "+userName);

		PrintWriter pw = resp.getWriter();
		pw.print("<html><body>");
		pw.print("<h1>Welcome to PageA "+userName+"</h1>");
		pw.print("</body></html>");
		
		req.setAttribute("un", userName);

		RequestDispatcher rd = req.getRequestDispatcher("pageb");// to dispatch to html page
		//pass html page name(ex: test.html) and for jsp also use name (ex: demo.jsp)
//		rd.forward(req, resp);//forward the request to the PageB
		rd.include(req, resp);// include the PageB inside PageA
	}
}
