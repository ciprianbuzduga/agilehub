package com.ciprianb.agilehub.pattern.observer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BusyObject {

	private List<ObjectObserver<BusyObject>> busyObjectObservers = new ArrayList<>();
	private Integer id;
	private String name;
	private LocalDate creationDate;

	public void updateObjectAndDependencies(String name, LocalDate creationDate) {
		this.name = name;
		if (creationDate.isBefore(this.creationDate)) {
			throw new IllegalArgumentException("The date can't be set before the original creation date");
		}

		busyObjectObservers.forEach(obs -> obs.updatedObject(this));
	}

	public void registryObserver(ObjectObserver<BusyObject> observer) {
		busyObjectObservers.add(observer);
	}

	public void unregistryObserver(ObjectObserver<BusyObject> observer) {
		busyObjectObservers.remove(observer);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

}
