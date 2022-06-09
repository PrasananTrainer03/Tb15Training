package com.java.abs;

abstract class Company {
	public abstract void location();
	public abstract void timing();
	public abstract void dressCode();
}

class Hasitha extends Company {

	@Override
	public void location() {
		System.out.println("Hasitha...Job Location is Bangalore...");
	}

	@Override
	public void timing() {
		System.out.println("Hasitha...Timings from 9 AM to 7 PM...");
	}

	@Override
	public void dressCode() {
		System.out.println("Hasitha...Dress Code Business Formals...");
	}
	
}

class Dada extends Company {

	@Override
	public void location() {
		System.out.println("Dada...Work Location is Chennai...");
	}

	@Override
	public void timing() {
		System.out.println("Dada...Working timings are from 7 PM to 3.30 PM");
	}

	@Override
	public void dressCode() {
		System.out.println("Dada...Business Formals/Casuals");
	}
	
}

public class AbsTest {

	public static void main(String[] args) {
		Company[] arr = new Company[] {
			new Dada(),
			new Hasitha()
		};
		
		for (Company c : arr) {
			c.location();
			c.timing();
			c.dressCode();
		}
	}
}
