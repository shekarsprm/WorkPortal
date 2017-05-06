package com.nit.webportal.factory;

import com.nit.webportal.service.LoginServiceIF;
import com.nit.webportal.service.LoginServiceImpl;
import com.nit.webportal.service.UserServiceIF;
import com.nit.webportal.service.UserServiceImpl;

public class ServiceFactory {
	private static LoginServiceIF loginServiceIF = null;
    private static UserServiceIF userServiceIF=null;
    	
	static {
		loginServiceIF = new LoginServiceImpl();
		userServiceIF=new UserServiceImpl();
	}

	public static LoginServiceIF getLoginFactory() {
		return loginServiceIF;
	}
	
	public static UserServiceIF getUserFactory(){
		return userServiceIF;
	}
}
