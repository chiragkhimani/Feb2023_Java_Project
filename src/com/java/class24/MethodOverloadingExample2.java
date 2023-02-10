package com.java.class24;

class Calculator {

	void sum(int num1, double num2) {
		System.out.println(num1 + num2);
	}

	void sum(double num1, int num2) {
		System.out.println(num1 + num2);
	}

}

public class MethodOverloadingExample2 {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.sum(10, 10.0);
		c.sum(10.0, 10);
	}
}
