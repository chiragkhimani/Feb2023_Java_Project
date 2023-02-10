package com.java.class21;

class Bike {
	int speed;

}

public class MultipleCopy {
	public static void main(String[] args) {
		Bike c1 = new Bike();

		Bike c2 = c1;

		c1.speed = 100;

		System.out.println(c2.speed);

	}
}
