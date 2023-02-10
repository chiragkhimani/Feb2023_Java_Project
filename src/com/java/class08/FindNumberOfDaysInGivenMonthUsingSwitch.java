package com.java.class08;

import java.util.Scanner;

// Write a program to take month from user and print
// number of days in given month

// Why we don't have to duplicate the code?
// Code inconstitency
// 

public class FindNumberOfDaysInGivenMonthUsingSwitch {
	public static void main(String[] args) {
		System.out.println("Please enter month number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		switch (num) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 days");
			break;
		case 2:
			System.out.println("28 / 29 days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 days");
			break;

		default:
			System.out.println("Invalid Input");
		}
	}
}
