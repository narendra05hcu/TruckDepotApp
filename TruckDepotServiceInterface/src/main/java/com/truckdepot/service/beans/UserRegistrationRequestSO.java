package com.truckdepot.service.beans;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.truckdepot.service.enums.UserType;

public class UserRegistrationRequestSO {
	@Valid
	private UserRegistrationSO userRegistrationSO;
	private ShipperSO shipperSO;
	private CarrierSO carrierSO;
	@NotNull
	private UserType userType;

	public UserRegistrationSO getUserRegistrationSO() {
		return userRegistrationSO;
	}

	public void setUserRegistrationSO(UserRegistrationSO userRegistrationSO) {
		this.userRegistrationSO = userRegistrationSO;
	}

	public ShipperSO getShipperSO() {
		return shipperSO;
	}

	public void setShipperSO(ShipperSO shipperSO) {
		this.shipperSO = shipperSO;
	}

	public CarrierSO getCarrierSO() {
		return carrierSO;
	}

	public void setCarrierSO(CarrierSO carrierSO) {
		this.carrierSO = carrierSO;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}
}
