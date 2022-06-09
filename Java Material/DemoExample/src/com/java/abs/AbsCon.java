package com.java.abs;

abstract class Employ {
	int empno;
	String name;
	double basic;
	
	public Employ(int empno, String name, double basic) {
		this.empno=empno;
		this.name=name;
		this.basic=basic;
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
}


class Gangaraju extends Employ {
	public Gangaraju(int empno, String name, double basic) {
		super(empno, name, basic);
	}
}

class Yellaji extends Employ {

	public Yellaji(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}

public class AbsCon {

	public static void main(String[] args) {
		Employ[] arr = new Employ[] {
			new Gangaraju(1, "Gangaraju", 84423),
			new Yellaji(3, "Yellaji", 99214)
		};
		for (Employ employ : arr) {
			System.out.println(employ);
		}
	}
}
