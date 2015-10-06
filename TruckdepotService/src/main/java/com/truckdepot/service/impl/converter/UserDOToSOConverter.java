package com.truckdepot.service.impl.converter;

import com.truckdepot.common.dao.entities.Carrier;
import com.truckdepot.common.dao.entities.Shipper;
import com.truckdepot.common.dao.entities.User;
import com.truckdepot.service.beans.CarrierSO;
import com.truckdepot.service.beans.ShipperSO;
import com.truckdepot.service.beans.UserLoginResponseSO;
import com.truckdepot.service.beans.UserSO;
import com.truckdepot.service.enums.UserType;

public class UserDOToSOConverter {

	public static UserLoginResponseSO convertLoginResponse(User user) {
		UserLoginResponseSO userLoginResponseSO = new UserLoginResponseSO();
		UserSO userSo = new UserSO();
		userSo.setCompanyName(user.getCompanyName());
		userSo.setEmailId(user.getEmailId());
		userSo.setEmailVerified(user.getEmailVerified());
		userSo.setFirstName(user.getFirstName());
		userSo.setIsActive(user.getIsActive());
		userSo.setIsAdmin(user.getIsAdmin());
		userSo.setLastName(user.getLastName());
		userSo.setMobileNumber(user.getMobileNumber());
		userSo.setMobileVerified(user.getMobileVerified());
		userLoginResponseSO.setUserSo(userSo);
		if(user instanceof Shipper) {
			Shipper shipper = (Shipper)user;
			ShipperSO shipperSO = new ShipperSO();
			shipperSO.setDefaultDestination(CommonConverter.convertAddressDOToSO(shipper.getDefaultDestination()));
			shipperSO.setDefaultOrigin(CommonConverter.convertAddressDOToSO(shipper.getDefaultOrigin()));
			userLoginResponseSO.setShipperSO(shipperSO);
			userLoginResponseSO.setUserType(UserType.SHIPPER);
		}
		
		if(user instanceof Carrier) {
			Carrier carrier = (Carrier)user;
			CarrierSO carrierSO = new CarrierSO();
			carrierSO.setAddress(CommonConverter.convertAddressDOToSO(carrier.getAddress()));
			carrierSO.setBusinessType(carrier.getBusinessType());
			userLoginResponseSO.setCarrierSO(carrierSO);
			userLoginResponseSO.setUserType(UserType.CARRIER);
		}
		
		return userLoginResponseSO;
	}

	

}
