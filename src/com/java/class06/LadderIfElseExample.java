package com.java.class06;

import java.util.Scanner;

// Write a program to print given digit in word (0-5)
// Input - 4
// output - Four

public class LadderIfElseExample {
	public static void main(String[] args) {
		System.out.println("Please enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num == 0) {
			System.out.println("Zero");
		} else if (num == 1) {
			System.out.println("One");
		} else if (num == 2) {
			System.out.println("Two");
		} else if (num == 3) {
			System.out.println("Three");
		} else if (num == 4) {
			System.out.println("Four");
		} else if (num == 5) {
			System.out.println("Five");
		} else {
			System.out.println("Invalid input");
		}

	}
}
