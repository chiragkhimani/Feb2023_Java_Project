package com.java.class14;

// Arrays - to store collections of data of similar type

public class OneDArrays {
	public static void main(String[] args) {
		// Creating array and storing data inside array
		int data[] = { 12, 23, 54, 73, 67 };

		// Printing one value from array at index 1
		System.out.println(data[1]);

		// Declaration of Array
		int numbers[] = new int[5];

		// Length of the array
		System.out.println(data.length);

		// Print all data from array
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		
		// Access index which is not exist
		System.out.println(data[6]);

	}
}
