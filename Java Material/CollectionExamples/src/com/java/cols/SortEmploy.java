package com.java.cols;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	
	public static void main(String[] args) {
	//	Comparator c = new NameComparator();
		Comparator c = new BasicComparator();
		SortedSet employs = new TreeSet(c);
		employs.add(new Employ(1, "Hasitha", 99424));
		employs.add(new Employ(2, "Jyoshna", 81423));
		employs.add(new Employ(3, "Gowtham", 91842));
		employs.add(new Employ(4, "Gangaraju", 97932));
		employs.add(new Employ(5, "Ashish", 89043));
		employs.add(new Employ(6, "Chethan", 87553));
		employs.add(new Employ(7, "PremaLatha", 930423));
		
		System.out.println("Employ List is   ");
		for (Object ob : employs) {
			Employ employ = (Employ)ob;
			System.out.println(employ);
		}
	}
}
