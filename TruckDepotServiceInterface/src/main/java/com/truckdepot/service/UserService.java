package com.truckdepot.service;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.truckdepot.service.beans.ResponseSO;
import com.truckdepot.service.beans.UserLoginRequestSO;
import com.truckdepot.service.beans.UserLoginResponseSO;
import com.truckdepot.service.beans.UserRegistrationRequestSO;

@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
@Path("/v1/user")
public interface UserService {
	@POST
    @Path("/login")
	public UserLoginResponseSO login(@Valid UserLoginRequestSO userLoginRequestSO);
	
	@POST
	@Path("/register")
	public ResponseSO register(@Valid UserRegistrationRequestSO userRegistrationRequestSO);

}
