package com.java.cols;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList names = new LinkedList();
		names.add("Rohit");
		names.add("Latha");
		names.add("Dada");
		names.add("Hemanth");
		names.add("Pooja"); 
		names.add("Hasitha");
		System.out.println("Names are  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.addFirst("Harshitha");
		names.addLast("Pooja");
		System.out.println("Names are   ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
