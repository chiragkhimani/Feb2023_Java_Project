package com.java.class24;

class GrandParent {
	int a = 5; // Instance of Parent Class
}

class Parent extends GrandParent {
	int a = 10; // Instance of Parent Class
}

class Child extends Parent {
	int a = 20; // Instance of Child Class

	void method1() {
		int a = 50; // Local

		System.out.println(a); // 50
		System.out.println(this.a); // 20
		System.out.println(super.a); // 10
	}
}

public class ExampleOfKeywords {
	public static void main(String[] args) {
		Child c = new Child();
		c.method1();
	}
}
