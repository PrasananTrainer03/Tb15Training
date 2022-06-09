package com.java.cols;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {
		List names = new ArrayList();
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
		
		names.add(3, "Harshitha");
		System.out.println("Names after adding new Item   ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		
		names.remove("Pooja");
		System.out.println("Names after removing  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
