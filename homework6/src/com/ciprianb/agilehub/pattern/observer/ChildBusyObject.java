package com.ciprianb.agilehub.pattern.observer;

public class ChildBusyObject implements ObjectObserver<BusyObject> {

	private final BusyObject parentObject;

	public ChildBusyObject(BusyObject parentObject) {
		this.parentObject = parentObject;
		parentObject.registryObserver(this);
	}

	@Override
	public void updatedObject(BusyObject busyObject) {
		if(!parentObject.equals(busyObject))
			throw new IllegalArgumentException("Invalid busyObject to observer!");
		System.out.println("Update children for " + busyObject);
	}

}
