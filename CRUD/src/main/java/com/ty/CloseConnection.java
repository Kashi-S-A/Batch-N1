package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CloseConnection {
	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/demo?user=postgres&password=root";
		try {
			Class.forName(driver);
			System.out.println("driver loaded");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		try (Connection connection = DriverManager.getConnection(url);) {
			System.out.println("connection created");

			Statement stm = connection.createStatement();
			System.out.println("statement is created");

			String s1 = "SELECT * FROM employee";

			stm.execute(s1);
			System.out.println("executed");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
