package com.java.class24;

class Shape {

	void draw() {
		System.out.println("Drawing shape");
	}

	void erase() {
		System.out.println("Erasing everything");
	}
}

class Triangle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing Triangle");
	}
}

class Squre extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing Squre");
	}
}

public class MethodOverriding2 {
	public static void main(String[] args) {
		Squre s = new Squre();
		s.draw();
		s.erase();
	}
}
