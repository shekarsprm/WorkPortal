package com.nit.webportal.dao;

import com.nit.webportal.exceptions.DaoException;

public interface LoginDaoIF {

	public boolean loginStatus(String username, String password) throws DaoException;
}
