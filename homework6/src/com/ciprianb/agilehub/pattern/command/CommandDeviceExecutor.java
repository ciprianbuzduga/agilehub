package com.ciprianb.agilehub.pattern.command;

public class CommandDeviceExecutor {

	String executeCommand(CommandDevice commandDevice) {
		if(commandDevice.isSupported()) {
			System.out.println("A new command will be executed.");
			return commandDevice.command();
		}
		throw new IllegalArgumentException("The command "
				+ commandDevice.getType() + " isn't supported!");
	}
}
