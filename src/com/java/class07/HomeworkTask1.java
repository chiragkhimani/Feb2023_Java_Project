package com.java.class07;

import java.util.Scanner;

public class HomeworkTask1 {
	public static void main(String[] args) {
		System.out.println("Please enter you grade: ");
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();

		if (grade > 100) {
			System.out.println("Invalid Input");
		} else if (grade >= 90) {
			System.out.println("Your grade is A+");
		} else if (grade >= 80) {
			System.out.println("Your grade is A");
		} else if (grade >= 70) {
			System.out.println("Your grade is B+");
		} else if (grade >= 60) {
			System.out.println("Your grade is B");
		} else if (grade >= 50) {
			System.out.println("Your grade is A");
		} else if (grade >= 40) {
			System.out.println("Your grade is B+");
		} else if (grade >= 0) {
			System.out.println("You failed");
		} else {
			System.out.println("Invalid Input");
		}
	}
}
