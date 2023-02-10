package com.java.class15;

public class FindPositiveAndNegative {
	public static void main(String[] args) {
		int data[] = { 12, 23, -54, 73, -67, 47, -32, 89 };
		
		int positiveCount = 0;
		int negativeCount = 0;

		for (int i = 0; i < data.length; i++) {

			if (data[i] >= 0) {
				positiveCount++;
			} else {
				negativeCount++;
			}

		}
		
		System.out.println("Total positive elements "+positiveCount);
		System.out.println("Total negative elements "+negativeCount);

	}
}
