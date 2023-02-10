package com.java.class20;

public class BankTester {
	public static void main(String[] args) {
		Bank acc1 = new Bank();
		Bank acc2 = new Bank();

		acc1.balance = 1000;
		acc1.accNumber = "634543543";
		acc1.isLocker = false;
		acc1.accName = "Manu";
		
		acc2.balance = 1500;
		acc2.accNumber = "43643435";
		acc2.accName = "Chirag";
		
		acc2.deposit(500);
		System.out.println(acc2.balance);
		
		acc1.withdraw(1000);
		System.out.println(acc1.balance);

	}
}
