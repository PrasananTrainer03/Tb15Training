package com.java.cols;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortDemo {

	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Rohit");
		names.add("Latha");
		names.add("Dada");
		names.add("Hemanth");
		names.add("Pooja"); 
		names.add("Hasitha");
		names.add("Gowtham");
		names.add("Siva");
		names.add("Jyoshna");
		
		System.out.println("Sorted Data is   ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
