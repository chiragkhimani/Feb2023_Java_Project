package com.java.class26;

public class Bank1 {
	private int balance;
	public String accName;
	protected String accNumber;
	String routingNumber;

	void withdraw(int amount) {
		balance = balance - amount;
	}

	void checkBalance() {
		System.out.println(balance);
	}
}

class EncapsulationExample {
	public static void main(String[] args) {

		Bank1 acc1 = new Bank1();
		acc1.checkBalance();

		acc1.withdraw(300);
		acc1.checkBalance();

		acc1.checkBalance();

	}
}
