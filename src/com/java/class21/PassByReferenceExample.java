package com.java.class21;

class Car {
	int speed;

	void increaseSpeed(Car c) {
		c.speed = c.speed + 100;
	}
}

public class PassByReferenceExample {
	public static void main(String[] args) {
		Car c1 = new Car();

		c1.speed = 100;

		c1.increaseSpeed(c1);

		System.out.println(c1.speed);
	}
}
