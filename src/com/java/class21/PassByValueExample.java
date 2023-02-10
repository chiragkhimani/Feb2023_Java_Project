package com.java.class21;

class Demo {
	int increaseValue(int num1) {
		return num1 + 100;
	}
}

public class PassByValueExample {
	public static void main(String[] args) {
		int num1 = 10;

		Demo d = new Demo();

		num1 = d.increaseValue(num1);

		System.out.println(num1);
	}
}
