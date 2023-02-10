package com.java.class13;

import java.util.Scanner;

// Write a program to print sum of digit of given number
// Input - 3543
// Output - 15

public class SumOfDigitOfNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;

		while (num <= 99 && num >= 0) {
			int lastDigit = num % 100;
			sum = sum + lastDigit;
			num = num / 10;
		}

		System.out.println(sum);

	}
}
