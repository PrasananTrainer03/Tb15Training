package com.java.arr;

public class Employ {

	int empno;
	String name;
	double basic;
	
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}

	public static void main(String[] args) {
		Employ e1 = new Employ();
		e1.empno=1;
		e1.name="Harshitha";
		e1.basic=93233;
		
		Employ e2 = new Employ();
		e2.empno=3;
		e2.name="Sandeep";
		e2.basic=93432;
		
		System.out.println(e1);
		System.out.println(e2);
	}
}
