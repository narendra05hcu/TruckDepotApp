package com.truckdepot.service.impl.bo;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truckdepot.common.dao.entities.Carrier;
import com.truckdepot.common.dao.entities.Shipper;
import com.truckdepot.common.dao.entities.User;
import com.truckdepot.common.dao.repository.CarrierRepository;
import com.truckdepot.common.dao.repository.ShipperRepository;
import com.truckdepot.common.dao.repository.UserRepository;
import com.truckdepot.service.beans.ResponseSO;
import com.truckdepot.service.beans.UserLoginRequestSO;
import com.truckdepot.service.beans.UserLoginResponseSO;
import com.truckdepot.service.beans.UserRegistrationRequestSO;
import com.truckdepot.service.impl.converter.UserDOToSOConverter;
import com.truckdepot.service.impl.converter.UserSOToDOConverter;

@Service
public class UserBOImpl {
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	CarrierRepository carrierRepository;
	
	@Autowired
	ShipperRepository shipperRepository;

	public UserLoginResponseSO login(UserLoginRequestSO userLoginRequestSO) {
		User user = userRepository.findByEmailIdAndPassword(
				userLoginRequestSO.getUserName(),
				userLoginRequestSO.getPassword());
		if(user ==  null) {
			UserLoginResponseSO userLoginResponseSO = new UserLoginResponseSO();
			userLoginResponseSO.setStatus(Response.Status.BAD_REQUEST.getStatusCode());
			userLoginResponseSO.setMessage("Invalid Credentials.");
			return userLoginResponseSO;
		} else {
			return UserDOToSOConverter.convertLoginResponse(user);
		}
	}

	public ResponseSO register(
			UserRegistrationRequestSO userRegistrationRequestSO) {
		User user = UserSOToDOConverter.convertRegistration(userRegistrationRequestSO);
		//userRepository.save(user);
		if(user instanceof Carrier) {
			carrierRepository.save((Carrier)user);
		} else {
			shipperRepository.save((Shipper)user);
		}
		ResponseSO responseSO = new ResponseSO();
		if(user.getUserId()>0) {
			responseSO.setStatus(Status.OK.getStatusCode());
		} else {
			responseSO.setStatus(Status.BAD_REQUEST.getStatusCode());
			responseSO.setMessage("Error while creating user");
		}
		return responseSO;
	}

}
