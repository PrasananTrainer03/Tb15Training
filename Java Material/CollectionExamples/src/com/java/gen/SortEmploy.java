package com.java.gen;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
	//	Comparator<Employ> c = new NameComparator();
		Comparator<Employ> c = new BasicComparator();
		SortedSet<Employ> employList = new TreeSet<Employ>(c);
		employList.add(new Employ(1, "Hasitha", 99424));
		employList.add(new Employ(2, "Jyoshna", 81423));
		employList.add(new Employ(3, "Gowtham", 91842));
		employList.add(new Employ(4, "Gangaraju", 97932));
		employList.add(new Employ(5, "Ashish", 89043));
		employList.add(new Employ(6, "Chethan", 87553));
		employList.add(new Employ(7, "PremaLatha", 930423));
		System.out.println("Employ List is   ");
		for (Employ e : employList) {
			System.out.println(e);
		}
	}
}
