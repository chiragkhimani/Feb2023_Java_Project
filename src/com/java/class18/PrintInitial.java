package com.java.class18;

import java.util.Scanner;

// Write a program to take full name from user and print initial of each word

//Input - Hello World, My Self Chirag
//Output - H.W.M.S.C.

public class PrintInitial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		// First Approach
		String words[] = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i].charAt(0) + ".");
		}

		// Second Approach
		String initial = str.charAt(0) + ".";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				initial = initial + str.charAt(i + 1) + ".";
			}
		}
		System.out.println(initial);
	}
}
