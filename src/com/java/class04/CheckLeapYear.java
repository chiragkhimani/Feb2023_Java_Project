package com.java.class04;

// Write a program to check given year is leap year or not
public class CheckLeapYear {
	public static void main(String[] args) {
		int year = 2016;

		if (year % 4 == 0) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not Leap year");
		}

	}
}
