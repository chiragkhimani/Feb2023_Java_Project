package com.java.class07;

public class BooleanExpression {
	public static void main(String[] args) {
		boolean b1 = true, b2 = false, b3=true;
		
		System.out.println(b1 && b2); // false
		System.out.println(b1 || b2); // true
		System.out.println(b1 && b2 || b3 && b1); // true
		System.out.println(b1 || b2 && b3 && b1 || b3 && b2 || b1 && b2 && b3);
		
	}
}
