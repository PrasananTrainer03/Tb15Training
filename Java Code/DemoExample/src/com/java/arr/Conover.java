package com.java.arr;

public class Conover {

	int a,b;
	
	public Conover() {
		this.a=12;
		this.b=15;
	}
	
	public Conover(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	
	@Override
	public String toString() {
		return "Conover [a=" + a + ", b=" + b + "]";
	}

	public static void main(String[] args) {
		Conover obj1 = new Conover();
		System.out.println(obj1);
		Conover obj2 = new Conover(18, 15);
		System.out.println(obj2);
	}
}
