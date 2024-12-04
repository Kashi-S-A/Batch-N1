package com.tyss.shop;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userEmail=req.getParameter("uname");
		String password=req.getParameter("upassword");
		
		Connection connection = ConnectionPool.giveConnection();
		
		String sql="SELECT * FROM register WHERE email=?";
		
		try {
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1, userEmail);
			
			ResultSet rs = ps.executeQuery();
			
			ConnectionPool.submitConnection(connection);
			
			if (rs.next()) {
				if (rs.getString(3).equals(password)) {
					RequestDispatcher rd=req.getRequestDispatcher("homepage.html");
					rd.forward(req, resp);
				} else {
					req.setAttribute("msg", "Invalid Password");
					RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
					rd.forward(req, resp);
				}
			}else {
				req.setAttribute("msg", "Email is not registered");
				RequestDispatcher rd=req.getRequestDispatcher("register.jsp");
				rd.forward(req, resp);
			}
			
		} catch (SQLException e) {
			req.setAttribute("msg", "Something Went wrong please try again later");
			RequestDispatcher rd=req.getRequestDispatcher("register.jsp");
			rd.forward(req, resp);
			e.printStackTrace();
		}
		
	}
}
