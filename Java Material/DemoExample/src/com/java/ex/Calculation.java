package com.java.ex;

public class Calculation {

	public void calc(int a, int b) throws NegativeException, NumberZeroException {
		if (a < 0 || b < 0) {
			throw new NegativeException("Negative Numbers Not Allowed...");
		} else if (a == 0 || b == 0) {
			throw new NumberZeroException("Zero is Invalid Value...");
		} else {
			int c=a+b;
			System.out.println("Sum is   " +c);
		}
	}
	
	public static void main(String[] args) {
		int a,b;
		a=5;
		b=8;
		Calculation obj = new Calculation();
		try {
			obj.calc(a, b);
		} catch (NegativeException | NumberZeroException e) {
			e.printStackTrace();
		}
	}
}
