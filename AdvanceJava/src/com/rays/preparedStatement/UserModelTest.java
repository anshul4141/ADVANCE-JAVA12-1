package com.rays.preparedStatement;

import java.text.SimpleDateFormat;

public class UserModelTest {

	public static void main(String[] args) throws Exception {

		testAdd();
		// testUpdate();
		// testDelete();

	}

	private static void testDelete() throws Exception {

		UserModel model = new UserModel();

		model.delete(3);

	}

	private static void testUpdate() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserBean bean = new UserBean();

		bean.setId(5);
		bean.setFirstName("Kanak");
		bean.setLastName("Soni");
		bean.setLoginId("kanak123@gmail.com");
		bean.setPassword("kanak@#123");
		bean.setDob(sdf.parse("2004-02-01"));
		bean.setGender("Female");

		UserModel model = new UserModel();

		model.update(bean);

	}

	private static void testAdd() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserBean bean = new UserBean();

		bean.setFirstName("Mayank");
		bean.setLastName("Choudhary");
		bean.setLoginId("montu123@gmail.com");
		bean.setPassword("montu@123");
		bean.setDob(sdf.parse("2004-02-01"));
		bean.setGender("Male");

		UserModel model = new UserModel();

		model.add(bean);

	}

}
