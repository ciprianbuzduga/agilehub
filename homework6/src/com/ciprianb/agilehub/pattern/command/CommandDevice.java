package com.ciprianb.agilehub.pattern.command;

@SuppressWarnings("preview")
public sealed interface CommandDevice permits TurnOffLightsCommand,
	TurnOnLightsCommand, TurnVolumeUpCommand {

	default boolean isSupported() {
		return true;
	}

	String command();

	String getType();

}
