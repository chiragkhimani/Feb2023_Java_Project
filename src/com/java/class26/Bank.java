package com.java.class26;

public abstract class Bank {
	
	int balance;

	abstract void displayRateOfInterest();

	public void withdraw(int amount) {
		balance = balance - amount;
	}
	
	public void deposit(int amount) {
		balance = balance + amount;
	}
}

class citiBank extends Bank {
	void displayRateOfInterest() {
		System.out.println("3.0%");
	}
}

class AxisBank extends Bank {
	void displayRateOfInterest() {
		System.out.println("4.0%");
	}
}
