package com.java.class09;

import java.util.Scanner;

public class CalculatorUsingSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter first number");
		int a = sc.nextInt();

		System.out.println("Please enter second number");
		int b = sc.nextInt();

		System.out.println("Please enter your operation");
		String operation = sc.next();

		switch (operation) {
		case "Add":
		case "Addition":
		case "+":
			System.out.println(a + b);
			break;

		case "Sub":
		case "Subtraction":
		case "-":
			System.out.println(a - b);
			break;

		case "Mul":
		case "Multiplication":
		case "*":
			System.out.println(a * b);
			break;

		case "Div":
		case "Division":
		case "/":
			System.out.println(a / b);
			
		default:
			System.out.println("please refresh to begin new operation");

		}
	}
}