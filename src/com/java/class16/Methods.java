package com.java.class16;

import java.util.Scanner;

public class Methods {
	public static void main(String[] args) {
		String title = "         Welcome to the Calculator";
		Scanner sc = new Scanner(System.in);

		printLine(title.length(), '=');
		System.out.println(title);
		printLine(title.length(), '=');

		System.out.println("Please enter first number");
		int num1 = sc.nextInt();
		printLine(20, '*');

		System.out.println("Please enter second number");
		int num2 = sc.nextInt();
		printLine(20, '*');

		System.out.println("Addition=" + (num1 + num2));
	}

	static void printLine(int numOfChar, char charFromUser) {
		for (int i = 1; i <= numOfChar; i++) {
			System.out.print(charFromUser);
		}
		System.out.println();
	}

}
