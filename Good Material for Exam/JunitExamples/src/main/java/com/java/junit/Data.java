package com.java.junit;

public class Data {

	public boolean posNeg(int n) {
		if (n >= 0) {
			return true;
		} else {
			return false;
		}
	}
	public int minArray(int[] a) {
		int min=a[0];
		for (int i : a) {
			if (min > i) {
				min=i;
			}
		}
		return min;
	}
	public int fact(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * fact(n-1);
		}
	}
	
	public int max3(int a, int b, int c) {
		int m=a;
		if (m < b) {
			m=b;
		}
		if (m < c) {
			m=c;
		}
		return m;
	}
	
	public String sayHello() {
		return "Welcome to JUnit Programming...";
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
}
