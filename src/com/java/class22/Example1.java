package com.java.class22;

class Bike {
	static int speed;
	int price;

	void updateData() {
		int price = 100;
	}

	void printData() {
		System.out.println(price);
	}
}

public class Example1 {
	public static void main(String[] args) {
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		Bike b3 = new Bike();
		b3.updateData();
		b3.printData();
	}
}
