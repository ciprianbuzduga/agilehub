package com.ciprianb.agilehub.pattern.command;

public final class TurnOffLightsCommand implements CommandDevice {

	@Override
	public String command() {
		return "The lights are off";
	}

	@Override
	public String getType() {
		return "turnOffLights";
	}

}
