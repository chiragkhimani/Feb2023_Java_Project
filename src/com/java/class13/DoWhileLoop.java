package com.java.class13;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {

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

			System.out.println("Do you want to try one more time?");
			System.out.println("Press 1 for Yes");
			System.out.println("Press 2 for No");

			choice = sc.nextInt();
		} while (choice == 1);
	}
}
