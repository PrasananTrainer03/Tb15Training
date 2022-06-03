package com.java.sup;

class Employ {
	
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

class SivaSai extends Employ {

	public SivaSai(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}
class Rajesh extends Employ {

	public Rajesh(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}
public class SupCon {

	public static void main(String[] args) {
		Employ[] arr = new Employ[] {
			new SivaSai(1, "SivaSai", 99234),
			new Rajesh(3, "Rajesh", 92344)
		};
		for (Employ e : arr) {
			System.out.println(e);
		}
	}
}
