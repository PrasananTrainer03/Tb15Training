package com.java.cols;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserAuth {

	public static void main(String[] args) {
		Map data = new HashMap();
		data.put("Siva", "Reddy");
		data.put("Harshitha","Chowdary");
		data.put("Chetan","Sai");
		data.put("Data", "Kalandhar");
		String user, pwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName and Password   ");
		user = sc.next();
		pwd = sc.next();
		String res = (String) data.get(user);
		if (pwd.equals(res)) {
			System.out.println("Correct Credentials...");
		} else {
			System.out.println("Invalid Credentials...");
		}
	}
}
