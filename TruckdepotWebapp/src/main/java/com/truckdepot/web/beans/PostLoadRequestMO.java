package com.truckdepot.web.beans;


public class PostLoadRequestMO {
	private AddressMO originAddress;
	private AddressMO destinationAddress;
	private String pickupDate;
	private String deliveryDate;
	private String pickupTime;
	private String deliveryTime;
	private String notes;
	private long shipperId;

	public AddressMO getOriginAddress() {
		return originAddress;
	}

	public void setOriginAddress(AddressMO originAddress) {
		this.originAddress = originAddress;
	}

	public AddressMO getDestinationAddress() {
		return destinationAddress;
	}

	public void setDestinationAddress(AddressMO destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	public String getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(String pickupDate) {
		this.pickupDate = pickupDate;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getPickupTime() {
		return pickupTime;
	}

	public void setPickupTime(String pickupTime) {
		this.pickupTime = pickupTime;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public long getShipperId() {
		return shipperId;
	}

	public void setShipperId(long shipperId) {
		this.shipperId = shipperId;
	}
}
