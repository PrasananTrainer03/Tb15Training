package com.java.intf;

interface Animal {
	void name();
	void type();
}

class Lion implements Animal {

	@Override
	public void name() {
		System.out.println("Name is Lion....");
	}

	@Override
	public void type() {
		System.out.println("Its Wild Animal...");
	}
	
}

class Crocodile implements Animal {

	@Override
	public void name() {
		System.out.println("Name is Crocodile...");
	}

	@Override
	public void type() {
		System.out.println("Its Water Animal...");
	}
	
}

public class IntfDemo {
	public static void main(String[] args) {
		Animal[] arr = new Animal[] {
			new Lion(),
			new Crocodile()
		};
		for (Animal animal : arr) {
			animal.name();
			animal.type();
		}
	}
}
