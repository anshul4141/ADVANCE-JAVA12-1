package com.rays.preparedStatement;

import java.text.SimpleDateFormat;

public class UserModelTest {

	public static void main(String[] args) throws Exception {

		testAdd();

	}

	private static void testAdd() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserBean bean = new UserBean();

		bean.setId(5);
		bean.setFirstName("Kanak");
		bean.setLastName("Soni");
		bean.setLoginId("kanak@gmail.com");
		bean.setPassword("kana@123");
		bean.setDob(sdf.parse("2004-02-01"));
		bean.setGender("Female");
		
		UserModel model = new UserModel();
		
		model.add(bean);

	}

}
