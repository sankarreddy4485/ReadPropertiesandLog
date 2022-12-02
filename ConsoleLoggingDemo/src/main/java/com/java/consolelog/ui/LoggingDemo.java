package com.java.consolelog.ui;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.java.consolelog.service.UserAuthentication;

public class LoggingDemo {
	private static final Log LOGGER = LogFactory.getLog(LoggingDemo.class);
	public static void main(String[] args) {
		
		try {
			UserAuthentication authentication = new UserAuthentication();
			authentication.loginUser("", "");
			LOGGER.info("User has logged in successfully");
		} catch(Exception exception) {
			LOGGER.info(exception.getMessage());
		}

	}

}
