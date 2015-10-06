package com.truckdepot.service.impl.converter;

import com.truckdepot.common.dao.entities.Carrier;
import com.truckdepot.common.dao.entities.Shipper;
import com.truckdepot.common.dao.entities.User;
import com.truckdepot.service.beans.UserRegistrationRequestSO;
import com.truckdepot.service.beans.UserRegistrationSO;
import com.truckdepot.service.enums.UserType;

public class UserSOToDOConverter {

	public static User convertRegistration(
			UserRegistrationRequestSO userRegistrationRequestSO) {
		UserType userType = userRegistrationRequestSO.getUserType();
		User user;
		if(UserType.CARRIER.equals(userType)) {
			user = new Carrier();
			user.setUserType(com.truckdepot.common.dao.enums.UserType.CARRIER);
			Carrier carrier = (Carrier) user;
			carrier.setAddress(CommonConverter.convertAddressSOToDo(userRegistrationRequestSO.getCarrierSO().getAddress()));
			carrier.setBusinessType(userRegistrationRequestSO.getCarrierSO().getBusinessType());
		} else {
			user = new Shipper();
			user.setUserType(com.truckdepot.common.dao.enums.UserType.SHIPPER);
			Shipper shipper = (Shipper) user;
			shipper.setDefaultDestination(CommonConverter.convertAddressSOToDo(userRegistrationRequestSO.getShipperSO().getDefaultDestination()));
			shipper.setDefaultOrigin(CommonConverter.convertAddressSOToDo(userRegistrationRequestSO.getShipperSO().getDefaultOrigin()));
		}
		UserRegistrationSO userRegistrationSO = userRegistrationRequestSO.getUserRegistrationSO();
		user.setCompanyName(userRegistrationSO.getCompanyName());
		user.setEmailId(userRegistrationSO.getEmailId());
		user.setFirstName(userRegistrationSO.getFirstName());
		user.setLastName(userRegistrationSO.getLastName());
		user.setMobileNumber(userRegistrationSO.getMobileNumber());
		user.setPassword(userRegistrationSO.getPassword());
		return user;
	}

}
