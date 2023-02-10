package com.java.class24;

class AmazonAccount {

	void createAccount(String name, String email, String pass) {

	}

	void createAccount(String name, int phoneNumber, String pass) {

	}

	void createAccount(String email, String pass) {

	}

}

public class MethodOverloadingExample {
	public static void main(String[] args) {
		AmazonAccount aa = new AmazonAccount();
		aa.createAccount("Chirag", "khi@he.com", "345435");
		aa.createAccount("Chirag", 453543, "345435");
		aa.createAccount("khi@he.com", "345435");
	}
}
