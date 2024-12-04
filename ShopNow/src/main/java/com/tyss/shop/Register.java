package com.tyss.shop;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Register extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("uname");
		String email=req.getParameter("uemail");
		String password=req.getParameter("upwd");
		
		Connection connection = ConnectionPool.giveConnection();
		
		String sql="INSERT INTO register VALUES(?,?,?)";
		
		try {
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			
			int update = ps.executeUpdate();
			
			ConnectionPool.submitConnection(connection);
			
			if (update>0) {
				req.setAttribute("msg", "Registered Successfully");
				RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
				rd.forward(req, resp);
			} else {
				req.setAttribute("msg", "Registered failed");
				RequestDispatcher rd=req.getRequestDispatcher("register.jsp");
				rd.forward(req, resp);
			}
			
		} catch (SQLException e) {
			req.setAttribute("msg", "Email is Already Registered");
			RequestDispatcher rd=req.getRequestDispatcher("register.jsp");
			rd.forward(req, resp);
			e.printStackTrace();
		}
	}
}
