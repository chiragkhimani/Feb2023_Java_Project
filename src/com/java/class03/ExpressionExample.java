package com.java.class03;

import java.util.Arrays;

public class ExpressionExample {
	public static void main(String[] args) {
		String s[] = {"1","2","15","-7","300"};
		Arrays.sort(s);
		
		for (String string : s) {
			System.out.println(string);
		}
	}
}
