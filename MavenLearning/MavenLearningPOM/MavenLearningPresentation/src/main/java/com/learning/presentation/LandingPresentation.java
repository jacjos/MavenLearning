package com.learning.presentation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LandingPresentation {
	
	private static final Logger logger = LoggerFactory.getLogger(LandingPresentation.class);
	
	public void doProcess(){
		
		logger.debug("Processing");
	}
	
	public String returnString(){
		return "Random String";
	}

}
