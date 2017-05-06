package com.nit.webportal.dao;

import com.nit.webportal.dto.UserInfoDTO;


public interface ProcessDaoIF {

	public boolean loginVerifaction(String username, String password);

	public UserInfoDTO getUserDetails(String username);

}
				