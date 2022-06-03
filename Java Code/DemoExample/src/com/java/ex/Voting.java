package com.java.ex;

public class Voting {

	public void check(int age) throws VotingException {
		if (age < 18) {
			throw new VotingException("You are not elligible for Voting...");
		} else {
			System.out.println("Age is   " +age);
		}
	}
	
	public static void main(String[] args) {
		int age=17;
		Voting obj = new Voting();
		try {
			obj.check(age);
		} catch (VotingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
