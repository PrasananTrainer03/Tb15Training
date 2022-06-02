package com.java.arr;

public class StaticEx {

	public void show() {
		System.out.println("From Show Method...");
	}
	
	public static void display() {
		System.out.println("From Display Method...");
	}
	
	public static void main(String[] args) {
		StaticEx.display();
		StaticEx obj = new StaticEx();
		obj.show();
	}
}
