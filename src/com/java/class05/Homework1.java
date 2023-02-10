package com.java.class05;

import java.util.Scanner;

// Write a program to get a number from the user and 
// print squre of given number
public class Homework1 {
	public static void main(String[] args) {
		// Creating object of Scanner class
		Scanner sc = new Scanner(System.in);

		// Taking input from user
		System.out.println("Please enter number: ");
		int num = sc.nextInt();

		int result = num * num;
		System.out.println("Squre of num: " + result);

	}
}
