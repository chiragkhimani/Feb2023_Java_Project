package com.java.class14;

public class MaxNumber {
	public static void main(String[] args) {
		int data[] = { 12, 23, 54, 73, 67, 34, 56, 12, 27 };

		int max = data[0];

		for (int i = 0; i < data.length; i++) {

			if (data[i] < max) {
				max = data[i];
			}

		}

		System.out.println(max);

	}
}
