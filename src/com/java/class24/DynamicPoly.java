package com.java.class24;

class Base {
	void method1() {
		System.out.println("From Parent");
	}
}

class Derived extends Base {
	void method1() {
		System.out.println("From Child Overriden Method");
	}

	void method2() {
		System.out.println("From Child Own Method");
	}
}

public class DynamicPoly {
	public static void main(String[] args) {
		Base b = new Base();
		b.method1();

		Derived d = new Derived();
		d.method1();

		Base bb = new Derived(); // Dynamic Polymorphism
		bb.method1();

//		Derived dd = new Base(); - Invalid
	}
}
