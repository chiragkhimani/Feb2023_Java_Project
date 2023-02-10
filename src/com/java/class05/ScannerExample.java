package com.java.class05;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		// Creating object of Scanner class
		Scanner sc = new Scanner(System.in);

		// Taking input from user
		System.out.println("Please enter number: ");
		int num = sc.nextInt();

		// Logic of checking number is odd or even
		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}

	}
}
