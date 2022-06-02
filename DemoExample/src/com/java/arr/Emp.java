package com.java.arr;

public class Emp {

	int empno;
	String name;
	double basic;
	
	public Emp() {
		this.empno=1;
		this.name="Baba";
		this.basic=99324;
	}

	public Emp(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
	public static void main(String[] args) {
		Emp emp1 = new Emp();
		System.out.println(emp1);
		Emp emp2 = new Emp(10, "Rohit", 92321);
		System.out.println(emp2);
	}
}
