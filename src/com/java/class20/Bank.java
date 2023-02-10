package com.java.class20;

public class Bank {
	
	// Properties or Characteristics or Variables
	double balance;
	String accNumber;
	static String routingNumber;
	boolean isLocker;
	String accName;
	

	// Action or Behavior or Methods
	void openAccount() {
		System.out.println("Opening account");
	}

	void applyForLoan() {
		System.out.println("Applying loan");
	}

	void transerMoney(String accNumber, double cash) {
		System.out.println("Transferring " + cash + " to " + accNumber);
	}

	void deposit(double amount) {
		balance = balance + amount;
	}

	void withdraw(double amount) {
		balance = balance - amount;
	}

}
