package com.java.class28;

public class Finally {

	public static void main(String[] args) {

		try {
			int a = 5, b = 0;
			System.out.println(a / b);
		} catch (Exception e) {
			// ignore
		} finally {
			System.out.println("Thanks for visit");
		}

	}

}
