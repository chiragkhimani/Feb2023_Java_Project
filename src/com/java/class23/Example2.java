package com.java.class23;

class Bike {
	int speed;

	void method1(Bike b) {
		b.speed = b.speed + 100;
	}

}

public class Example2 {
	public static void main(String[] args) {
		Bike honda = new Bike();
		Bike hero = new Bike();

		honda.speed = 200;
		hero.speed = 400;

		hero.method1(hero);

		System.out.println(honda.speed);
	}
}
