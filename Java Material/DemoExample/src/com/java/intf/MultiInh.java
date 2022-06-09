package com.java.intf;

interface IOne {
	void name();
}

interface ITwo {
	void email();
}

class Gowtham implements IOne, ITwo {

	@Override
	public void email() {
		System.out.println("Email is Gowtham@gmail.com");
	}

	@Override
	public void name() {
		System.out.println("Name is Gowtham...");
	}
	
}

public class MultiInh {
	public static void main(String[] args) {
		Gowtham obj = new Gowtham();
		obj.name();
		obj.email();
	}
}
