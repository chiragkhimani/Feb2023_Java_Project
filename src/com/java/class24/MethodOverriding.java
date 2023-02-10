package com.java.class24;

class Bank1 {
	void displayRateOfInterest() {
		System.out.println("6.0%");
	}
}

class CitiBank1 extends Bank1 {
	void displayRateOfInterest() {
		System.out.println("5.0%");
	}
}

class ChaseBank1 extends Bank1 {
	void displayRateOfInterest() {
		System.out.println("7.0%");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		ChaseBank1 cb = new ChaseBank1();
		cb.displayRateOfInterest();
	}
}
