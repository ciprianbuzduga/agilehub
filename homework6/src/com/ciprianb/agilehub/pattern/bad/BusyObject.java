package com.ciprianb.agilehub.pattern.bad;

import java.time.LocalDate;

/**
 * Refactor the code below so that the addHistoryMessage and updateChildren
 * method are extracted from this class into separate observers.
 * See in {@link com.ciprianb.agilehub.pattern.observer.BusyObject}
 * @author cbuzduga
 */
public class BusyObject {

	private Integer id;
	private String name;
	private LocalDate creationDate;

	public void updateObjectAndDependencies(String name, LocalDate creationDate) {
		this.name = name;
		if (creationDate.isBefore(this.creationDate)) {
			throw new IllegalArgumentException("The date can't be set before the original creation date");
		}

		addHistoryMessage();
		updateChildren();
	}

	private void addHistoryMessage() {
		// do nothing
	}

	private void updateChildren() {
		// do nothing
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
