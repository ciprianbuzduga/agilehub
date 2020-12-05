package com.ciprianb.agilehub.pattern.command;

public final class TurnOnLightsCommand implements CommandDevice {

	@Override
	public String command() {
		return "The lights are on";
	}

	@Override
	public String getType() {
		return "turnOnLights";
	}

}
