package com.java.class22;

class Bank {
	static int speed;
	int balance;

	void updateData() {
		balance = 100;
	}

	static void printData() {
		System.out.println(speed);
	}
}

public class Example2 {
	
	
	public static void main(String[] args) {
		int a=0; // instace
		Bank.printData();
		System.out.println(a);

	}
}
