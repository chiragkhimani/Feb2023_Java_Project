package com.java.class28;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Hello User, Welcome to my Bank");

		try {
			String str = null;
			System.out.println(str.length());
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a / b);
		} catch (InputMismatchException e) {
			System.out.println("Sorry! Please eat lemon to get out of hangover and enter number only");
		} catch (ArithmeticException e) {
			System.out.println("Sorry! Enter number greater than zero");
		} catch (Exception e) {
			System.out.println("Sorry! it's not u, it's us, we run into an erorr. Pleaes try after sometime");
		}

		System.out.println("Thanks for visiting, see you next time");
	}
}
