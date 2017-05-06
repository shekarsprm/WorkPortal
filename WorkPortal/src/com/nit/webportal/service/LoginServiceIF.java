package com.nit.webportal.service;

import com.nit.webportal.exceptions.ServiceException;

public interface LoginServiceIF {

	public boolean loginStatus(String username, String password, String appName, String appId) throws ServiceException;

}
