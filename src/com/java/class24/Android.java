package com.java.class24;

class Phone {
	void call() {
		System.out.println("Calling");
	}

	void repair() {
		System.out.println("Repairing");
	}
}

class Android extends Phone {

	void repair() {
		System.out.println("Repairing Android Phone");
	}
}

class iPhone extends Phone {

	void repair() {
		System.out.println("Repairing iPhone");
	}
}
