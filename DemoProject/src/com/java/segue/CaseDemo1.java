package com.java.segue;

public class CaseDemo1 {

	public void show(int choice) {
		
		switch(choice) {
		case 1 : 
			System.out.println("HI I am Dada Kalandar...");
			break;
		case 2 : 
			System.out.println("Hi I am Chetan...");
			break;
		case 3 : 
			System.out.println("Hi I am Jyotshna...");
			break;
		case 4 : 
			System.out.println("Hi I am Hashitha...");
			break;
		case 5 : 
			System.out.println("Hi I am SuryaDevi...");
			break;
		default : 
			System.out.println("Invalid Choice...");
			break;
		}
	}
	
	public static void main(String[] args) {
		int choice=4;
		CaseDemo1 obj1 = new CaseDemo1();
		obj1.show(choice);
	}
}
