package com.java.cols;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {

	public static void main(String[] args) {
		Map data = new Hashtable();
		data.put(1, "Siva Reddy");
		data.put(2, "Latha");
		data.put(3, "Harshitha");
		data.put(4, "Chethan");
		data.put(5, "Jyoshna");
		int key;
		String result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key    ");
		key=sc.nextInt();
		result = (String)data.get(key);
		System.out.println("Result is   " +result);
	}
}
