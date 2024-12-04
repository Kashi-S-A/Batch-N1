package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch {
	public static void main(String[] args) {
		String driver="org.postgresql.Driver";
		String url="jdbc:postgresql://localhost:5432/demo?user=postgres&password=root";
		
		try {
			Class.forName(driver);
			
			Connection connection = DriverManager.getConnection(url);
			
			Statement statement = connection.createStatement();
			
			String sql="SELECT * FROM employee";
			
			ResultSet rs= statement.executeQuery(sql);
			
			System.out.println("=========Employees===========");
			while (rs.next()) {
				int eid=rs.getInt(1);
				String name=rs.getString(2);
				String email=rs.getString(3);
				long phone=rs.getLong(4);
				
				System.out.println(eid);
				System.out.println(name);
				System.out.println(email);
				System.out.println(phone);
				System.out.println("=================");
			}
			
			connection.close();
			
			System.out.println("executed and fetched");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
