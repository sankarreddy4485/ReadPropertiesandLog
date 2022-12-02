package com.java.consolelog.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class UserAuthentication {
	Log logger = LogFactory.getLog(UserAuthentication.class);
	
	public void loginUser(String userName, String password) throws Exception{
		try {
			if(userName.isEmpty() || password.isEmpty()) {
				throw new Exception("Service.INVALID_CREDENTIALS");
			}
			logger.info(userName+" logged in successfully");
		} catch(Exception exception) {
			logger.error(exception.getMessage(), exception);
			throw exception;
		}
	}

}
