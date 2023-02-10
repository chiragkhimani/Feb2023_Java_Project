package com.java.class16;

// Write a program to print greatest number out of four number

public class GreatestNumberFromFour {
	public static void main(String[] args) {
		int a = 210, b = 123, c = 34, d = 43;

		if (Math.max(a, b) > Math.max(c, d)) {
			System.out.println(Math.max(a, b));
		} else {
			System.out.println(Math.max(c, d));
		}

	}

	static int findMax(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
}
