package com.rays.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.rays.bean.UserBean;
import com.rays.util.JDBCDataSource;

public class UserModel {

	public UserBean findByPk(int id) throws Exception {

		Connection conn = JDBCDataSource.getConnection();

		PreparedStatement ptmt = conn.prepareStatement("select * from users where id = ?");

		ptmt.setInt(1, id);

		ResultSet rs = ptmt.executeQuery();

		UserBean bean = null;

		while (rs.next()) {

			bean = new UserBean();

			bean = new UserBean();
			bean.setId(rs.getInt(1));
			bean.setFirstName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setLoginId(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setDob(rs.getDate(6));
			bean.setGender(rs.getString(7));

		}
		return bean;

	}

	public void delete(int id) throws Exception {

		Connection conn = JDBCDataSource.getConnection();

		PreparedStatement ptmt = conn.prepareStatement("delete from users where id = ?");

		ptmt.setInt(1, id);

		int i = ptmt.executeUpdate();

		System.out.println("data deleted = " + i);

	}

	public List search(UserBean bean) throws Exception {

		Connection conn = JDBCDataSource.getConnection();

		StringBuffer sql = new StringBuffer("select * from users where 1=1");

		if (bean != null) {

			if (bean.getFirstName() != null && bean.getFirstName().length() > 0) {
				sql.append(" and firstName like '" + bean.getFirstName() + "'");

			}

		}
		System.out.println(sql.toString());

		PreparedStatement ptmt = conn.prepareStatement(sql.toString());
		ResultSet rs = ptmt.executeQuery();

		List list = new ArrayList();

		while (rs.next()) {
			bean = new UserBean();
			bean.setId(rs.getInt(1));
			bean.setFirstName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setLoginId(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setDob(rs.getDate(6));
			bean.setGender(rs.getString(7));
			list.add(bean);
		}
		return list;

	}

	public int nextPK() throws Exception {

		int pk = 0;
		Connection conn = JDBCDataSource.getConnection();

		PreparedStatement ptmt = conn.prepareStatement("select max(id) from users");
		ResultSet rs = ptmt.executeQuery();

		while (rs.next()) {
			pk = rs.getInt(1);

			System.out.println("max id" + pk);
		}
		return pk + 1;
	}

	public void add(UserBean bean) throws Exception {
		Connection conn = JDBCDataSource.getConnection();

		UserBean existBean = findbyloginId(bean.getLoginId());

		if (existBean != null) {

			System.out.println("login id is not exist please use different loginId");
		} else {

			PreparedStatement ptmt = conn.prepareStatement("insert into users values(?, ?, ?, ?, ?, ?, ?)");

			ptmt.setInt(1, nextPK());
			ptmt.setString(2, bean.getFirstName());
			ptmt.setString(3, bean.getLastName());
			ptmt.setString(4, bean.getLoginId());
			ptmt.setString(5, bean.getPassword());
			ptmt.setDate(6, new java.sql.Date(bean.getDob().getTime()));
			ptmt.setString(7, bean.getGender());

			int i = ptmt.executeUpdate();
			System.out.println("successfull " + i);
		}

	}

	private UserBean findbyloginId(String loginId) throws Exception {

		Connection conn = JDBCDataSource.getConnection();

		PreparedStatement ptmt = conn.prepareStatement("select * from users where loginId=?");
		ptmt.setString(1, loginId);
		ResultSet rs = ptmt.executeQuery();

		UserBean bean = null;

		while (rs.next()) {

			bean = new UserBean();

			bean.setId(rs.getInt(1));
			bean.setFirstName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setLoginId(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setDob(rs.getDate(6));
			bean.setGender(rs.getString(7));
		}

		return bean;
	}

	public void update(UserBean bean) throws Exception {
		Connection conn = JDBCDataSource.getConnection();

		PreparedStatement pstmt = conn.prepareStatement(
				"update users set firstName = ?, lastName = ?, loginId = ?, password = ?, dob = ?, gender = ? where id = ?");

		pstmt.setString(1, bean.getFirstName());
		pstmt.setString(2, bean.getLastName());
		pstmt.setString(3, bean.getLoginId());
		pstmt.setString(4, bean.getPassword());
		pstmt.setDate(5, new java.sql.Date(bean.getDob().getTime()));
		pstmt.setString(6, bean.getGender());
		pstmt.setInt(7, bean.getId());

		int i = pstmt.executeUpdate();

		System.out.println("Update successfully.. " + i);
	}

	public UserBean authenticate(String loginId, String password) throws Exception {

		Connection conn = JDBCDataSource.getConnection();

		PreparedStatement pstmt = conn.prepareStatement("select * from users where loginId = ? and password = ?");

		pstmt.setString(1, loginId);
		pstmt.setString(2, password);

		ResultSet rs = pstmt.executeQuery();

		UserBean bean = null;

		while (rs.next()) {

			bean = new UserBean();
			bean.setId(rs.getInt(1));
			bean.setFirstName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setLoginId(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setDob(rs.getDate(6));
			bean.setGender(rs.getString(7));

		}
		return bean;

	}

}
