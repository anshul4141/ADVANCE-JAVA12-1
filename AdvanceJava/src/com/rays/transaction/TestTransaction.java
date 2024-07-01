package com.rays.transaction;

import java.sql.Connection;
import java.sql.Statement;

import com.rays.util.JDBCDataSource;

// Transaction handling is a logical unit of work that will commit and rollback in single attempt
public class TestTransaction {

	public static void main(String[] args) throws Exception {

		Connection conn = null;

		try {

			conn = JDBCDataSource.getConnection();

			Statement stmt = conn.createStatement();

			// step 1
			conn.setAutoCommit(false);

			int i = stmt.executeUpdate(
					"insert into users values(9, 'niraj', 'chopra', 'niraj@gmail.com', 'pass@123', '2002-12-13', 'Male')");

			i = stmt.executeUpdate(
					"insert into users values(9, 'Avnish', 'Upadhyay', 'avnish@gmail.com', 'pass@123', '2002-12-13', 'Male')");

			i = stmt.executeUpdate(
					"insert into users values(9, 'aniruddh', 'meena', 'meena@gmail.com', 'pass@123', '2002-12-13', 'Male')");

			System.out.println("data inserted");

			// step 2
			conn.commit();

		} catch (Exception e) {

			// step 3
			conn.rollback();

			System.out.println("data not inserted");

			System.out.println(e.getMessage());

		}

	}

}
