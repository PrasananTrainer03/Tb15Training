package com.java.arr;

public class BoxingExample {

	public static void main(String[] args) {
		int a=12;
		double b=12.5;
		String str="Hello World";
		
		/* Implement Boxing */
		
		Object ob1=a;
		Object ob2=b;
		Object ob3=str;
		
		/* Implement Unboxing */ 
		int x = (Integer)ob1;
		double y = (Double)ob2;
		String s = (String)ob3;
		
		System.out.println("X value is   " +x);
		System.out.println("Y value is   " +y);
		System.out.println("String is  " +s);
	}
}
