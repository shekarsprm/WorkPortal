package com.nit.webportal.factory;

import com.nit.webportal.dao.LoginDaoIF;
import com.nit.webportal.dao.LoginDaoImpl;

public class DaoFactory {

	private static LoginDaoIF loginDaoIF = null;

	static {
		loginDaoIF = new LoginDaoImpl();
	}

	public static LoginDaoIF getLoginDaoFactory() {
		return loginDaoIF;
	}

}
