package com.java.class21;

public class Bank {

	// Properties or Characteristics or Variables
	double balance;
	String accNumber;
	String accName;

	// Constructor
	Bank(String name, double bal) {
		balance = bal;
		accName = name;
		accNumber = name + "0000";
	}

	Bank() {
		System.out.println("This is no arg constructor");
	}

	// Action or Behavior or Methods
	void deposit(double amount) {
		balance = balance + amount;
	}

	void withdraw(double amount) {
		balance = balance - amount;
	}
	
	
}
