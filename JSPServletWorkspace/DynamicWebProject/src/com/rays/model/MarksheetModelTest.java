package com.rays.model;

import com.rays.bean.MarksheetBean;

public class MarksheetModelTest {

	public static void main(String[] args) throws Exception {

		testAdd();

	}

	private static void testAdd() throws Exception {

		MarksheetBean bean = new MarksheetBean();

		MarksheetModel model = new MarksheetModel();

		bean.setId(1);
		bean.setRollNo(100);
		bean.setName("Raman");
		bean.setChm(55);
		bean.setPhy(55);
		bean.setMaths(55);
		model.add(bean);

	}

}
