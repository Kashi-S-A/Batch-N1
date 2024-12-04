package com.ty;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/disp")
public class Display extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("un", "admin");
		req.setAttribute("phone", 23456789);
		
		Student student=new Student();
		student.setName("Dinga");
		student.setEmail("dinga@gmail.com");
		
		req.setAttribute("stu", student);
		
		RequestDispatcher rd=req.getRequestDispatcher("display.jsp");
		rd.forward(req, resp);
	}
}
