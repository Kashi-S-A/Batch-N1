package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) {
		String driver="org.postgresql.Driver";
		String url="jdbc:postgresql://localhost:5432/demo";
		String user="postgres";
		String password="root";
		
		try {
			//step 1 : load driver
			Class.forName(driver);
			System.out.println("driver is loaded");
			
			//step 2 : create connection
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("connection is created");
			
			//step 3 : create statement
			Statement stm = con.createStatement();
			System.out.println("statement is created");
			
			String sql="INSERT INTO employee VALUES(101,'Penga','penga@gmail.com',8765567)";
			
			//step 4 : execute the query
			System.out.println(stm.execute(sql));;
			System.out.println("query executed and data is inserted");
			
			//step 5 : close the connection
			con.close();
			System.out.println("connection is closed");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
