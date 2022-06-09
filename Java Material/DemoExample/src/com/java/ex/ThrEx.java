package com.java.ex;

public class ThrEx {

	public void check(int x) {
		if (x < 0) {
			throw new NumberFormatException("Negative Numbers not allowed...");
		} else if (x == 0) {
			throw new ArithmeticException("Zero is Invalid Value...");
		} else {
			System.out.println("X value is  " +x);
		}
	}
	
	public static void main(String[] args) {
		ThrEx obj = new ThrEx();
		try {
			obj.check(53);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
