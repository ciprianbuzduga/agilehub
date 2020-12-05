package com.ciprianb.agilehub.pattern.command;

public final class TurnVolumeUpCommand implements CommandDevice {

	@Override
	public String command() {
		return "The volume has been turned up";
	}

	@Override
	public String getType() {
		return "turnVolumeUp";
	}

}
