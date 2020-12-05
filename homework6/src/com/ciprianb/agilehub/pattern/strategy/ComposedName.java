package com.ciprianb.agilehub.pattern.strategy;

public interface ComposedName {

	void compose(String firstName, String lastName, String strategy);

	static void composeFirstNameFirst(String firstName, String lastName) {
		System.out.println(firstName + " " + lastName);
	}

	static void composeLastNameFirst(String firstName, String lastName) {
		System.out.println(lastName + " " + firstName);
	}
}
