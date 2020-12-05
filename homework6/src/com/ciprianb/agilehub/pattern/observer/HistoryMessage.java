package com.ciprianb.agilehub.pattern.observer;

public class HistoryMessage implements ObjectObserver<BusyObject> {

	private final BusyObject parentObject;

	public HistoryMessage(BusyObject parentObject) {
		this.parentObject = parentObject;
		parentObject.registryObserver(this);
	}

	@Override
	public void updatedObject(BusyObject busyObject) {
		if(!parentObject.equals(busyObject))
			throw new IllegalArgumentException("Invalid busyObject to observer!");
		System.out.println("Add history message for update object " + busyObject);
	}

}
