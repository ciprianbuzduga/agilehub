package com.ciprianb.agilehub.pattern.bad;

/**
 * Refactor piece of code using the Command pattern
 * @author cbuzduga
 */
public class BadCommand {

	public void commandDevice(String operation) {
		if (operation.equals("turnOffLights")) {
			System.out.println("The lights are off");
		} else if (operation.equals("turnOnLights")) {
			System.out.println("The lights are on");
		} else if (operation.equals("turnVolumeUp")) {
			System.out.println("The volume has been turned up");
		}
	}

}
