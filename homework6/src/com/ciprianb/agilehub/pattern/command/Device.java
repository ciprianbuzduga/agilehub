package com.ciprianb.agilehub.pattern.command;

public class Device {

	private final CommandDeviceExecutor commandExecutor;

	public Device() {
		commandExecutor = new CommandDeviceExecutor();
	}

	public void turnOffLights() {
		runCommand(new TurnOffLightsCommand());
	}

	private void runCommand(CommandDevice commandDevice) {
		String result = commandExecutor.executeCommand(commandDevice);
		System.out.println(result);
	}

	public void turnOnLights() {
		runCommand(new TurnOnLightsCommand());
	}

	public void turnVolumeUp() {
		runCommand(new TurnVolumeUpCommand());
	}
}
