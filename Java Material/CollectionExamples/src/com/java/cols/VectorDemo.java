package com.java.cols;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v = new Vector(3, 2); 
		// means first allocate memory for 3 elements, after filling 3 elements, next allocate memory for 2 more elements
		System.out.println("Size   " +v.size());
		System.out.println("Capacity   " +v.capacity());
		v.addElement("Rohit");
		v.addElement("Latha");
		v.addElement("Dada");
		System.out.println("Size   " +v.size());
		System.out.println("Capacity   " +v.capacity());
		v.addElement("Hasitha");
		System.out.println("Size   " +v.size());
		System.out.println("Capacity   " +v.capacity());
	}
}
