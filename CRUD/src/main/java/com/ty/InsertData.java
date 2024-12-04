package com.ty;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
	public static void main(String[] args) {
		String driver="org.postgresql.Driver";
		String url="jdbc:postgresql://localhost:5432/demo?user=postgres&password=root";
		
		try {
			Class.forName(driver);
			
			Connection connection = DriverManager.getConnection(url);
			
			String sql="call procedure_name(?,?,?,?)";
			
			CallableStatement cstm = connection.prepareCall(sql);
			cstm.setInt(1, 101);
			cstm.setString(2, "Dinga");
			cstm.setString(3, "dinga@gmail.com");
			cstm.setLong(4, 987654320l);
			
			cstm.execute();
			
			connection.close();
			
			System.out.println("executed");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
