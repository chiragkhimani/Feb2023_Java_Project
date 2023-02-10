package com.java.class23;

// Parent Class or Base Class or Super Class

public class Calculator {

	Calculator() {
		System.out.println("From Parent Class Constructor");
	}

	void sum(int a, int b) {
		System.out.println("sum=" + (a + b));
	}

	void sub(int a, int b) {
		System.out.println("sub=" + (a - b));
	}

}

// Child Class or Derived Class or Sub Class

class AdvanceCalculator extends Calculator {

	AdvanceCalculator() {
		System.out.println("From Child Class Constructor");
	}

	void mul(int a, int b) {
		System.out.println(a * b);
	}

	void div(int a, int b) {
		System.out.println(a / b);
	}
}
