package com.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CRUDOperation {

	public static void main(String[] args) throws Exception {

		// add();
		// delete();
		// search();
		// findByLogin();
		// findById();
		authenticate();
		// update();

	}

	private static void authenticate() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceJava", "root", "root");

		Statement stmt = conn.createStatement();

		ResultSet rs = stmt
				.executeQuery("select * from users where loginId = 'uday@gmail.com' and password = 'pass123'");

		if (rs.next()) {

			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(4));
			System.out.println(rs.getString(5));
			System.out.println(rs.getDate(6));
			System.out.println(rs.getString(7));

		} else {
			System.out.println("loginId or Password is invalid");
		}

	}

	private static void update() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceJava", "root", "root");

		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("update users set firstName = 'Raman' where id = 1");

		System.out.println("Data Updated successfully... " + i);

	}

	private static void add() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceJava", "root", "root");

		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate(
				"insert into users values(4, 'Naman', 'Malwiya', 'naman@gmail.com', 'pass123', '2002-01-22', 'Male')");

		System.out.println("Data inserted successfully... " + i);

	}

}
