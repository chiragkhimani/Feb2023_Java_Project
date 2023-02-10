package com.java.class15;

public class SumOfEachRowFrom2DArray {
	public static void main(String[] args) {
		int data[][] = { { 12, 23 }, { 73, 67 }, { 23, 56 } };

		for (int i = 0; i < data.length; i++) {

			// Before each row sum will reset to zero
			int sum = 0;

			// Do sum of each element in the row
			for (int j = 0; j < data[i].length; j++) {
				sum = sum + data[i][j];
			}

			// Print sum of each row
			System.out.println(sum);

		}
	}
}
