package com.java.class24;

class Vehicle {

	Vehicle() {
		System.out.println("From Vehicle");
	}

}

class Car extends Vehicle {

	Car() {
		System.out.println("From Car");
	}

}

class SportsCar extends Car {

	SportsCar() {
		System.out.println("From Sports Car");
	}

}

public class ConstructorChainingExample {
	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
	}
}
