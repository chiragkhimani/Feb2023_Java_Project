package com.java.class05;

import java.util.Scanner;

// Write a program to take total bill amount and discount percentage from user and 
// print value of final bill amount after discount
public class Homework3 {
	public static void main(String[] args) {
		// Creating object of Scanner class
		Scanner sc = new Scanner(System.in);

		// Taking input from user
		System.out.println("Please enter total bill: ");
		double bill = sc.nextDouble();

		System.out.println("Please enter discount percentage: ");
		double discountPercentage = sc.nextDouble();

		double discountAmount = bill * discountPercentage / 100;
		double finalAmount = bill - discountAmount;

		System.out.println("Final amount : " + finalAmount);
	}
}
