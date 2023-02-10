package com.java.class06;

import java.util.Scanner;

// Write a program to take month from user and print
// number of days in given month
public class FindNumberOfDaysInGivenMonth {
	public static void main(String[] args) {
		System.out.println("Please enter month number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num == 1) {
			System.out.println("31 days");
		} else if (num == 2) {
			System.out.println("28 / 29 days");
		} else if (num == 3) {
			System.out.println("31 days");
		} else if (num == 4) {
			System.out.println("30 days");
		} else if (num == 5) {
			System.out.println("31 days");
		} else if (num == 6) {
			System.out.println("30 days");
		} else if (num == 7) {
			System.out.println("31 days");
		} else if (num == 8) {
			System.out.println("31 days");
		} else if (num == 9) {
			System.out.println("30 days");
		} else if (num == 10) {
			System.out.println("31 days");
		} else if (num == 11) {
			System.out.println("30 days");
		} else if (num == 12) {
			System.out.println("31 days");
		} else {
			System.out.println("Invalid Input");
		}
	}
}
