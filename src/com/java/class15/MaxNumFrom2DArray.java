package com.java.class15;

public class MaxNumFrom2DArray {
	public static void main(String[] args) {
		int data[][] = { { 12, 23, 54 }, { 73, 67, 23 }, { 23, 12, 56 } };

		// Before the whole array we will initialize max to zero
		int max = 0;

		for (int i = 0; i < data.length; i++) {

			for (int j = 0; j < data[i].length; j++) {
				if (data[i][j] > max) {
					max = data[i][j];
				}
			}

		}

		System.out.println(max);
	}
}
