package com.java.class27;

interface Bank {
	
	int i = 10;

	public abstract void displayRateOfInterest();

	void deposit(int amount);

	void withdraw(int amount);
}

interface GovernmentBank extends Bank{
	void audit();

	void bond();
}

class CitiBank implements Bank {

	int balance;

	@Override
	public void displayRateOfInterest() {
		System.out.println("6.0%");
	}

	@Override
	public void deposit(int amount) {
		balance = balance + amount;
	}

	@Override
	public void withdraw(int amount) {
		balance = balance - amount;
		balance = balance - 50; // fee
	}

}

public class AbstractionExample {
	public static void main(String[] args) {
		System.out.println(Bank.i);
	}
}
