package com.nit.webportal.dao;

import com.nit.webportal.exceptions.DaoException;

public interface UserDaoIF {
	
	public boolean verifyCreds(String username,String password)throws DaoException;
	public UserDTO userInfo(String username)throws DaoException;
	public int countLoginTimes(String username)throws DaoException;
	public void updatenNumberOfLoginTimes(String username)throws DaoException;
	public void updatLastLoginTime(String username)throws DaoException;
	public Integer updateConsectiveFailures(String username)throws DaoException;
	public Integer findConsetiveFailureCount(String username)throws DaoException;
	public Integer expireDateVerification(String username)throws DaoException;
	public void updateConsetiveFailureZero(String username)throws DaoException;
	public String userRole(String username)throws DaoException;
	public Integer updatePassword(String username,String password)throws DaoException;
	public void updateUserForm(UserDTO userDTO)throws DaoException;
	
		
}
