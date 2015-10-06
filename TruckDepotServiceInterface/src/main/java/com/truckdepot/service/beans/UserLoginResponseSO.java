package com.truckdepot.service.beans;

import com.truckdepot.service.enums.UserType;

public class UserLoginResponseSO extends ResponseSO {
	private UserSO userSo;
	private ShipperSO shipperSO;
	private CarrierSO carrierSO;
	private UserType userType;

	public UserSO getUserSo() {
		return userSo;
	}

	public void setUserSo(UserSO userSo) {
		this.userSo = userSo;
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
