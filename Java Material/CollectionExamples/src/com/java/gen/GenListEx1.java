package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenListEx1 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Rohit");
		names.add("Latha");
		names.add("Dada");
		names.add("Hemanth");
		names.add("Pooja"); 
		names.add("Hasitha");
		System.out.println("Names are  ");
		for (String s : names) {
			System.out.println(s);
		}
	}
}
