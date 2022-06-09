package com.java.arr;

public class StringArrayDemo {

	public void show() {
		String[] names = new String[] {
			"Dada","Harshini","Jyoshna","Pooja","Rohit"	
		};
		for (String s : names) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		StringArrayDemo obj = new StringArrayDemo();
		obj.show();
	}
}
