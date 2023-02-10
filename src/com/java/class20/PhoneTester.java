package com.java.class20;

public class PhoneTester {
	public static void main(String[] args) {
		// Creating object of the class
		Phone iPhone11;

		// initialize object
		iPhone11 = new Phone();

		// Create and initialize object in the same line
		Phone samsungS20 = new Phone();

		iPhone11.color = "White";
		iPhone11.memory = 64;
		iPhone11.model = "Apple iPhone 11 64GB";
		iPhone11.cameraPixel = 48;

		System.out.println(iPhone11.color);
		System.out.println(iPhone11.memory);
		System.out.println(iPhone11.model);
		System.out.println(iPhone11.cameraPixel);

		System.out.println(samsungS20.color);
		System.out.println(samsungS20.memory);
		System.out.println(samsungS20.model);
		System.out.println(samsungS20.cameraPixel);

	}
}
