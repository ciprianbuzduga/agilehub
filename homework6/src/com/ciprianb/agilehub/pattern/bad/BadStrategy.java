package com.ciprianb.agilehub.pattern.bad;

/**
 * Refactor piece of code using the Strategy pattern
 * 
 * @author cbuzduga
 */
public class BadStrategy {

	public void useStrategy(String firstName, String lastName, String strategy) {
		if (strategy.equals("firstNameFirst")) {
			System.out.println(firstName + " " + lastName);
		} else if (strategy.equals("lastNameFirst")) {
			System.out.println(lastName + " " + firstName);
		} else {
			System.out.println("Not a valid strategy");
		}
	}

}
