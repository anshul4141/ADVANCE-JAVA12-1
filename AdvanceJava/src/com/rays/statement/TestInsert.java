package com.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestInsert {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceJava", "root", "root");

		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate(
				"insert into users values(3, 'Anish', 'Malwiya', 'anish@gmail.com', 'pass123', '2002-01-22', 'Male')");

		System.out.println("Data inserted successfully... " + i);

	}
}
