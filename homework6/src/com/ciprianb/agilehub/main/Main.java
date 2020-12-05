package com.ciprianb.agilehub.main;

import java.time.LocalDate;

import com.ciprianb.agilehub.pattern.bad.BadCommand;
import com.ciprianb.agilehub.pattern.bad.BadStrategy;
import com.ciprianb.agilehub.pattern.command.Device;
import com.ciprianb.agilehub.pattern.observer.BusyObject;
import com.ciprianb.agilehub.pattern.observer.ChildBusyObject;
import com.ciprianb.agilehub.pattern.observer.HistoryMessage;
import com.ciprianb.agilehub.pattern.strategy.ComposedName;

public class Main {

	public static void main(String[] args) {
		System.out.println(">>>>>>>> Command Pattern <<<<<<<<<");
		BadCommand badCommand = new BadCommand();
		badCommand.commandDevice("turnOnLights");

		Device device = new Device();
		device.turnOnLights();
		device.turnVolumeUp();
		device.turnOffLights();

		System.out.println(">>>>>>>> Strategy Pattern <<<<<<<<<");
		BadStrategy badStrategy = new BadStrategy();
		badStrategy.useStrategy("John", "Doe", "firstNameFirst");
		badStrategy.useStrategy("John", "Doe", "firstNameLastName");

		ComposedName.composeFirstNameFirst("John", "Doe");
		ComposedName.composeLastNameFirst("John", "Doe");

		System.out.println(">>>>>>>> Observer Pattern <<<<<<<<<");
		BusyObject busyObject = new BusyObject();
		LocalDate creationDate = LocalDate.now(); 
		busyObject.setCreationDate(creationDate);
		ChildBusyObject childBusyObject = new ChildBusyObject(busyObject);
		HistoryMessage historyMessage = new HistoryMessage(busyObject);
		busyObject.updateObjectAndDependencies("busyObject", creationDate);
	}
}
