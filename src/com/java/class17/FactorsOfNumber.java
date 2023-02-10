package com.java.class17;
// Write a program to find factors of given number

import java.util.Scanner;

// Input - 6, Output - 1, 2, 3, 6
// Input - 28, Output - 1, 2, 4, 7, 14, 28

public class FactorsOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pleaes enter number");
		int num = sc.nextInt();
		printFactors(num);
	}

	static void printFactors(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}

}