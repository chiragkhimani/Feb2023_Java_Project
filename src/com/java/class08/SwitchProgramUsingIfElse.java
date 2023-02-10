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

public class SwitchProgramUsingIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the number");
		int num = sc.nextInt();

		if (num == 0) {
			System.out.println("Sunday");
		} else if (num == 1) {
			System.out.println("Monday");
		} else if (num == 2) {
			System.out.println("Tuesday");
		} else if (num == 3) {
			System.out.println("Wednesday");
		} else if (num == 4) {
			System.out.println("Thursday");
		} else if (num == 5) {
			System.out.println("Friday");
		} else if (num == 6) {
			System.out.println("Saturday");
		} else {
			System.out.println("Invalid Input");
		}

	}

}
