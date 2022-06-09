package com.java.arr;

public class ArrayExample1 {

	public void show() {
		int[] a = new int[] {13,32,64,23};
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
		for (int i : a) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ArrayExample1 obj = new ArrayExample1();
		obj.show();
	}
}
