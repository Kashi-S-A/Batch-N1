package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) {
		String driver="org.postgresql.Driver";
		String url="jdbc:postgresql://localhost:5432/demo";
		String user="postgres";
		String password="root";
		
		try {
			Class.forName(driver);
			
			Connection connection = DriverManager.getConnection(url, user, password);
			
			Statement stm = connection.createStatement();
			
			String sql="UPDATE employee SET phone=1234567890 WHERE eid=101";
			
			stm.execute(sql);
			
			connection.close();
			
			System.out.println("connection is created and record updated");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
