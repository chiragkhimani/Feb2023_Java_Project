package com.java.class26;

class Car {
	private int speed;
	private String color;
	private int yearOfMake;

	// Getters
	public int getSpeed() {
		return speed;
	}

	// Setters
	public void setSpeed(int speed) {
		this.speed = speed;
	}

}

public class ExampleOfGetSet {
	public static void main(String[] args) {
		Car c = new Car();
		c.setSpeed(1000);
		System.out.println(c.getSpeed());
	}
}
