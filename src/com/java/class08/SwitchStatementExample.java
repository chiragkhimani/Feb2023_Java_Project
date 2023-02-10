package com.java.class08;

import java.util.Scanner;

// Write a java program to print day name based num on dayber
// 0 - Sunday
// 1 - Monday
// 2 - Tuesday
// 3 - Wednesday
// 4 - Thursday 
// 5 - Friday
// 6 - Saturday

public class SwitchStatementExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the number");
		int num = sc.nextInt();
		

		switch (num) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid Input");
		}

	}

}
