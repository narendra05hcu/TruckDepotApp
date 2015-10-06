package com.truckdepot.service.beans;


public class ShipperSO {
	private AddressSO defaultDestination;

	private AddressSO defaultOrigin;

	public AddressSO getDefaultDestination() {
		return defaultDestination;
	}

	public void setDefaultDestination(AddressSO defaultDestination) {
		this.defaultDestination = defaultDestination;
	}

	public AddressSO getDefaultOrigin() {
		return defaultOrigin;
	}

	public void setDefaultOrigin(AddressSO defaultOrigin) {
		this.defaultOrigin = defaultOrigin;
	}
}
