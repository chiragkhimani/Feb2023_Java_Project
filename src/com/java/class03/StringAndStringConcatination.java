package com.java.class03;

public class StringAndStringConcatination {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		int a = 10;
		int b = 20;

		System.out.println(str1 + str2);
		System.out.println(str1 + a);
		System.out.println(str1 + a + b);
		System.out.println(str1 + (a + b));
		System.out.println(str1 + a * b);
		// System.out.println(str1 + a - b);
		System.out.println("str1" + a + b);

	}
}
