package com.java.class10;

//Write a program to print multiplication of 1 to 5
public class ForLoopExample5 {
	public static void main(String[] args) {

		int sum = 1;

		for (int i = 1; i <= 5; i++) {
			sum = sum * i;
		}

		System.out.println(sum);

	}
}

