package com.java.class24;

public class PhoneRepairUserClass {
	public static void main(String[] args) {
		Android samsungGalaxyS22 = new Android();

		iPhone iPhone13 = new iPhone();

		PhoneRepairShop repairShop = new PhoneRepairShop();

		repairShop.repair(samsungGalaxyS22);
	}
}
