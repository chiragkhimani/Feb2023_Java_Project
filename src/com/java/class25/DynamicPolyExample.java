package com.java.class25;

import java.util.Scanner;

class Browser {
	void openNewIncogitoWindow() {
		System.out.println("Cntr + T");
	}
}

class Chrome extends Browser {
	void openNewIncogitoWindow() {
		System.out.println("Cntr + Shift + N");
	}
}

class FireFox extends Browser {
	void openNewIncogitoWindow() {
		System.out.println("Cntr + Shift + P");
	}
}

public class DynamicPolyExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the browser you want to open ");
		String browser = sc.nextLine();

		// Declaring refernece of Parent class
		Browser b;

		if (browser.equals("Chrome")) {
			b = new Chrome();

		} else {
			b = new FireFox();
		}

		b.openNewIncogitoWindow();
	}
}
