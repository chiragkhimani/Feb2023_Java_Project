package com.java.class15;

public class StringMethods {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "hello";

		// 1. Equality of the String
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));

		// Equality of the String ignoring the case
		System.out.println(str1.equalsIgnoreCase(str3));

		// 2. Contains
		String str4 = "Hello Chirag, Welcome to the Ebay;";
		System.out.println(str4.contains(str1));
		System.out.println(str4.toLowerCase().contains(str3.toLowerCase()));

		// 3. Convert cases of String
		System.out.println(str4.toLowerCase());
		System.out.println(str4.toUpperCase());

		// 4. Check if String is empty
		String str5 = " ";
		System.out.println(str5.isEmpty());

		// 5. Legth of the String
		System.out.println(str4.length());

		// 6. Find character at particular index
		System.out.println(str4.charAt(6));

		// 7. Find index of particular character / String
		System.out.println(str4.indexOf(" "));

		// 8. Trimming the String
		String str6 = "         Java       Programming   ";
		System.out.println(str6.trim());

		// 9. Sub String - Extract the sub string
		str4 = "Hello Chirag, Welcome to the Ebay;";
		System.out.println(str4.substring(14));
		System.out.println(str4.substring(str4.indexOf("Welcome")));
		System.out.println(str4.substring(14, 21));

		// 10. Format
		String title = "Hello %s, Welcome to %s";
		String username = "Manu";
		String website = "Amazon";
		System.out.println(String.format(title, username, website));

		// 11. Replace
		String str7 = "This will cost you INR 200";
		System.out.println(str7.replace("INR", "USD"));
		// replaceAll() - we will learn this once we understand regular expression

		// 12. Split
		String parts[] = str7.split("");
		for (int i = 0; i < parts.length; i++) {
			System.out.println(parts[i]);
		}

	}
}
