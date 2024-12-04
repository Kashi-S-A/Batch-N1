package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
		String driver="org.postgresql.Driver";
		String url="jdbc:postgresql://localhost:5432/demo";
		String user="postgres";
		String password="root";
		
		String dbUrl="jdbc:postgresql://localhost:5432/demo?user=postgres&password=root";
		
		try {
			Class.forName(driver);
			
//			Connection connection=DriverManager.getConnection(url, user, password);
			
			Connection connection=DriverManager.getConnection(dbUrl);
			
			Statement stm=connection.createStatement();
			
			String sql="DELETE FROM employee WHERE eid=102";
			
			stm.execute(sql);
			
			connection.close();
			
			System.out.println("connection is created and record is deleted");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
