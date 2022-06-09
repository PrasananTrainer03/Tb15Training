package com.java.ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample1 {

	public void show() {
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(dt));
	}
	public static void main(String[] args) {
		DateExample1 obj = new DateExample1();
		obj.show();
	}
}
