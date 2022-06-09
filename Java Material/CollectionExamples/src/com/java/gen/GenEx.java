package com.java.gen;

class Data<T> {
	
	public void swap(T a, T b) {
		T t;
		t=a;
		a=b;
		b=t;
		System.out.println("A value is   " +a+ " B value is   " +b);
	}
	
}

public class GenEx {

	public static void main(String[] args) {
		Data obj = new Data();
		int a=5, b=7;
		obj.swap(a, b);
		String s1="Gowtham", s2="Chethan";
		obj.swap(s1, s2);
	}
}
