package com.java.class20;

public class Phone {

	// Properties or Characteristics or Variables
	String color; // null
	int memory; // 0
	String model;
	int cameraPixel;
	
	
	// Action or Behavior or Methods
	void browse(String url) {
		System.out.println("Opening " + url);
	}

	void call(String number) {
		System.out.println("calling to " + number);
	}

	void sms(String number, String text) {
		System.out.println("texting " + text + " to " + number);
	}

}
