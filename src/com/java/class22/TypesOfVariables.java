package com.java.class22;

class Demo {
	int a; // Object / Instance variable
	static int b; // Static Variable

	void method1() {
		int a = 0; // Local Variable
		System.out.println(a); // 20
		System.out.println(this.a); // 10
	}

	void method2() {
		System.out.println(a); // 10
	}
}

public class TypesOfVariables {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.method1();
	}
}
