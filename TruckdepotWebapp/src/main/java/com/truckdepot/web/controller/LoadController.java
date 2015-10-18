package com.truckdepot.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.truckdepot.web.beans.PostLoadRequestMO;
import com.truckdepot.web.beans.ResponseMO;
import com.truckdepot.web.beans.SearchLoadRequestMO;
import com.truckdepot.web.beans.SearchLoadResponseMO;

@Controller
@RequestMapping("/*")
public class LoadController {
	@RequestMapping(value = "/load/search", method=RequestMethod.GET)
	public @ResponseBody SearchLoadResponseMO searchLoad(@ModelAttribute("searchLoadRequestMO") SearchLoadRequestMO searchLoadRequestMO, HttpServletRequest request, HttpServletResponse response, Model model) {
		System.out.println("login page called");
		return new SearchLoadResponseMO();

	}
	
	@RequestMapping(value = "/load/submit", method=RequestMethod.POST, produces={MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody ResponseMO submitLoad(@ModelAttribute("postLoadRequestMO") PostLoadRequestMO postLoadRequestMO, HttpServletRequest request, HttpServletResponse response, Model model) {
		System.out.println("login page called");
		return new ResponseMO();

	}
	
}
