package com.java.abs;

abstract class Training {
	public abstract void name();
	public abstract void email();
}

class Sahithi extends Training {

	@Override
	public void name() {
		System.out.println("Name is Sahithi...");
	}

	@Override
	public void email() {
		System.out.println("Email is sahithi@gmail.com");
	}
	
}

class Chetan extends Training {

	@Override
	public void name() {
		System.out.println("Name is Chethan Sai...");
	}

	@Override
	public void email() {
		System.out.println("Email is chetansai@gmail.com");
	}
	
}

public class AbsDemo {
	public static void main(String[] args) {
		Training[] arr = new Training[] {
			new Chetan(),
			new Sahithi()
		};
		
		for (Training t : arr) {
			t.name();
			t.email();
		}
	}
}
