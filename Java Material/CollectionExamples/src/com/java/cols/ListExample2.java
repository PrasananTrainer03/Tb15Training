package com.java.cols;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {

	public static void main(String[] args) {
		List numbers = new ArrayList();
		numbers.add(new Integer(423));
		numbers.add(new Integer(12));
		numbers.add(new Integer(99));
		numbers.add(new Integer(10));
		numbers.add(new Integer(19));
		
		int sum=0;
		
		for (Object ob : numbers) {
			sum+=(Integer)ob;
		}
		System.out.println("Sum   " +sum);
	}
}
