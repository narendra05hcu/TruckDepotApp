package com.truckdepot.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.truckdepot.web.beans.CarrierRegistrationMO;
import com.truckdepot.web.beans.ShipperRegistrationMO;

@Controller
@RequestMapping("/*")
public class RegistrationController {
	@RequestMapping(value = "/register/carrier", method=RequestMethod.POST)
	public String carrierRegistration(@ModelAttribute("carrierRegistrationMO") CarrierRegistrationMO carrierRegistrationMO, HttpServletRequest request, HttpServletResponse response, Model model) {
		System.out.println("login page called");
		return "home";

	}
	
	@RequestMapping(value = "/register/shipper", method=RequestMethod.POST)
	public String shipperRegistration(@ModelAttribute("shipperRegistrationMO") ShipperRegistrationMO shipperRegistrationMO, HttpServletRequest request, HttpServletResponse response, Model model) {
		System.out.println("login page called");
		return "home";

	}
	
	@RequestMapping(value = "/register", method=RequestMethod.GET)
	public String registrationPage(HttpServletRequest request, HttpServletResponse response, Model model) {
		System.out.println("login page called");
		return "register";

	}
}
