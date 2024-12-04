package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CloseUsingFinally {
	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/demo?user=postgres&password=roo";
		Connection connection = null;
		try {
			Class.forName(driver);
			System.out.println("driver loaded");

			connection = DriverManager.getConnection(url);
			System.out.println("connection created");

			Statement stm = connection.createStatement();
			System.out.println("statement is created");

			String s1 = "SELECT * FROM employee()";

			stm.execute(s1);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection!=null) {
					connection.close();
					System.out.println("executed and connection is closed");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
