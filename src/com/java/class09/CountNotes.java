package com.java.class09;

import java.util.Scanner;

// Write a Program To Count Total Number Of Minimum Notes In Given Amount 
// (Notes are of 1, 2, 5, 10, 20, 100 & 500)

public class CountNotes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the amount");
		int amount = sc.nextInt();

		// Divide amount with 500 so we will get number of notes of 500
		int result = 0;
//		if (result > 0) {
//			System.out.println("you need " + result + " notes of 500");
//			amount = amount % 500; // We will remove the amount that is multiple of 500
//		}

		// Divide amount with 100 on remainder amount
		// so we will get number of notes of 100
		result = amount / 100;
		if (result > 0) {
			System.out.println("you need " + result + " notes of 100");
			amount = amount % 100; // // We will remove the amount that is multiple of 100
		}

		result = amount / 20;
		if (result > 0) {
			System.out.println("you need " + result + " notes of 20");
			amount = amount % 20;
		}

		result = amount / 10;
		if (result > 0) {
			System.out.println("you need " + result + " notes of 10");
			amount = amount % 10;
		}

		result = amount / 5;
		if (result > 0) {
			System.out.println("you need " + result + " notes of 5");
			amount = amount % 5;
		}

		result = amount / 2;
		if (result > 0) {
			System.out.println("you need " + result + " notes of 2");
			amount = amount % 2;
		}

		if (amount > 0) {
			System.out.println("you need " + amount + " notes of 1");
		}

	}
}
