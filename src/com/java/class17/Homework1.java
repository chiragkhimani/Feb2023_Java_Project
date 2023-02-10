package com.java.class17;

// Write a program to print all numbers from 1 to 10 which has a 
// factorial value of less than 200
//Output - 1,2,3,4,5

public class Homework1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (fact(i) < 200) {
				System.out.println(i);
			}
		}
	}

	static int fact(int num) {
		int mul = 1;

		for (int i = 1; i <= num; i++) {
			mul = mul * i;
		}

		return mul;
	}

	static int getSqure(int num) {
		return num * num;
	}
}
