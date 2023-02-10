package com.java.class14;

// Arrays - to store collections of data of similar type

public class TwoDArrays {
	public static void main(String[] args) {
		// Creating array and storing data inside array
		int data[][] = { { 12, 23, 54 }, { 73, 67, 23 }, { 23, 12, 56 } };

		// Printing one value from array at index 1
		System.out.println(data[1][2]);

		//Another way Declaration of Array
		int numbers[][] = new int[3][3];
		
		// Total row in array
		System.out.println(data.length);

		// Total column in specific row
		System.out.println(data[1].length);

		// Print all data from array
		for (int i = 0; i < data.length; i++) {

			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + " ");
			}

			System.out.println();
		}

	}
}
