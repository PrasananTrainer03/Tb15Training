package com.java.ex;

public class DivisionEx {

	public static void main(String[] args) {
		int a,b,c;
		try {
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println("Division Value   " +c);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Arguments are not passed...");
		} catch (ArithmeticException e) {
			System.out.println("Division by zero impossible...");
		} catch (NumberFormatException e ) {
			System.out.println("String Cannot be Converted as Integer...");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Program from Segue 15 batch...");
		}
	}
}
