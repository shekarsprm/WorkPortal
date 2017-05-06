package com.nit.webportal.service;

import com.nit.webportal.dao.LoginDaoIF;
import com.nit.webportal.exceptions.DaoException;
import com.nit.webportal.exceptions.ServiceException;
import com.nit.webportal.factory.DaoFactory;
import com.nit.webportal.utils.PropertiyRaderUtils;

public class LoginServiceImpl implements LoginServiceIF{

	private LoginDaoIF loginDaoIF;
	public boolean loginStatus(String username, String password, String appName, String appId) throws ServiceException {
		boolean status=Boolean.FALSE;
		loginDaoIF=DaoFactory.getLoginDaoFactory();

		try {
			status=loginDaoIF.loginStatus(username, password);
		
		} catch (DaoException e) {
		
			e.printStackTrace();
		
		}
		
		
		return status;
	}

}
