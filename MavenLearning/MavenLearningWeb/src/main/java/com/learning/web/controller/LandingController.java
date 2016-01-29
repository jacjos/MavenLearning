package com.learning.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.learning.presentation.LandingPresentation;
import com.learning.web.constants.WebApplicationConstants;

@Controller
public class LandingController {
	
	private static final Logger logger = LoggerFactory.getLogger(LandingController.class);
	
	@Autowired
	WebApplicationConstants webappConstants;
	
	@Autowired
	LandingPresentation landingPresentation;
	
	@RequestMapping({"/home", "/login"})
	public ModelAndView loadApp(){
		
		logger.debug("Inside method : {}", "loadApp");
		landingPresentation.doProcess();
		
		ModelAndView modelView = new ModelAndView(webappConstants.view_name_bootstrap);
		return modelView;
	}

}
