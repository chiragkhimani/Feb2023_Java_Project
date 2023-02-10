package com.java.class15;

public class StringExamples {

	public static void main(String[] args) {
		int i = 10;

		String str1 = "Hello";

		String str2 = "Hello";

		String str3 = new String("Hello");

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		System.out.println(str1 == str2); // true
		System.out.println(str1 == str3); // false

	}

}
