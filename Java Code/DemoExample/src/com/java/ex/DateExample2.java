package com.java.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample2 {

	public void show(String str) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dt = sdf.parse(str);
		System.out.println(dt);
	}
	public static void main(String[] args) {
		String dt="2022-06-03";
		DateExample2 obj = new DateExample2();
		try {
			obj.show(dt);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
