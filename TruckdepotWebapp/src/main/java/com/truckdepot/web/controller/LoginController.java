package com.truckdepot.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.truckdepot.web.beans.UserLoginMO;

@Controller
@RequestMapping("/*")
public class LoginController {
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public String loginSubmit(@ModelAttribute("userLoginMO") UserLoginMO userLoginMO, HttpServletRequest request, HttpServletResponse response, Model model) {
		System.out.println("login page called");
		return "home";

	}
	
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public String loginPage(HttpServletRequest request, HttpServletResponse response, Model model) {
		System.out.println("login page called");
		return "login";

	}
}
