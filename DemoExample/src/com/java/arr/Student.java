package com.java.arr;

public class Student {

	int sno;
	String name;
	String city;
	double cgp;
	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", city=" + city + ", cgp=" + cgp + "]";
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.sno=1;
		s1.name="Siva Sai";
		s1.city="Tirupathi";
		s1.cgp=9.2;
		
		Student s2 = new Student();
		s2.sno=3;
		s2.name="Rajesh";
		s2.city="Tirupathi";
		s2.cgp=9.1;
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
