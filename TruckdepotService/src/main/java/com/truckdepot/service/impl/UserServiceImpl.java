package com.truckdepot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truckdepot.service.UserService;
import com.truckdepot.service.beans.ResponseSO;
import com.truckdepot.service.beans.UserLoginRequestSO;
import com.truckdepot.service.beans.UserLoginResponseSO;
import com.truckdepot.service.beans.UserRegistrationRequestSO;
import com.truckdepot.service.impl.bo.UserBOImpl;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserBOImpl userBOImpl;

	@Override
	public UserLoginResponseSO login(UserLoginRequestSO userLoginRequestSO) {
		UserLoginResponseSO userLoginResponseSO = userBOImpl.login(userLoginRequestSO);
		return userLoginResponseSO;
	}

	@Override
	public ResponseSO register(
			UserRegistrationRequestSO userRegistrationRequestSO) {
		ResponseSO responseSO = userBOImpl.register(userRegistrationRequestSO);
		return responseSO;
	}

	
}