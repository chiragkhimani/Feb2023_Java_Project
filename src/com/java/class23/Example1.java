package com.java.class23;

class Car {
	int speed;

	int method1(int speed) {
		speed = speed + 100;
		return speed;
	}

}

public class Example1 {
	public static void main(String[] args) {
		Car c1 = new Car();

		c1.speed = c1.method1(100);
		System.out.println(c1.speed);
	}
}
