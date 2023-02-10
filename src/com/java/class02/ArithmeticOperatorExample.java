package com.java.class02;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		
		System.out.println(10 % 3); // 1
		
		System.out.println(10 % 4); // 2
		
		System.out.println(13 % 4); // 1
		
		System.out.println(7 % 10); // 7
		
		System.out.println(6 % 3); // 0
		
		// Odd / Even
		System.out.println(6 % 2);  // 0
		System.out.println(13 % 2); // 1
		System.out.println(21 % 2); // 1
		System.out.println(26 % 2); // 0
		
		// Get last digit from number using num%10
		System.out.println(6 % 10);  // 6
		System.out.println(13 % 10); // 3
		System.out.println(21 % 10); // 1
		System.out.println(26 % 10); // 6
		
		// Remove last digit from number using number / 10
		System.out.println(1 / 2); // 0
		System.out.println(15 / 10); // 1
		System.out.println(23 / 10.0); // 2.3
		
		System.out.println(6 / 10);  // 0
		System.out.println(13 / 10); // 1
		System.out.println(21 / 10); // 2
		System.out.println(26 / 10); // 2
		System.out.println(263 / 10); // 26
		
	}
}
