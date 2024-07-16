package com.rays.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.rays.bean.MarksheetBean;
import com.rays.util.JDBCDataSource;

public class MarksheetModel {

	public void add(MarksheetBean bean) throws Exception {

		Connection conn = JDBCDataSource.getConnection();

		PreparedStatement pstmt = conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");

		pstmt.setInt(1, bean.getId());
		pstmt.setInt(2, bean.getRollNo());
		pstmt.setString(3, bean.getName());
		pstmt.setInt(4, bean.getPhy());
		pstmt.setInt(5, bean.getChm());
		pstmt.setInt(6, bean.getMaths());

		int i = pstmt.executeUpdate();

		System.out.println("data added successfully " + i);

	}

}
