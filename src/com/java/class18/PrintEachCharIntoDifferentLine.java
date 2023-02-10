package com.java.class18;

// Write a program to print each char of the String into different line
// Input - Hello
// Output
//  H
//  e
//  l
//  l
//  o

public class PrintEachCharIntoDifferentLine {

	public static void main(String[] args) {
		String str = "Hello";

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

	}

}
