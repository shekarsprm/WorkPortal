package com.nit.webportal.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.log4j.Logger;

import com.nit.webportal.dto.UserInfoDTO;
import com.nit.webportal.utils.DbUtils;

public class ProcessDaoImpl implements ProcessDaoIF {

	
	private static Logger LOGGER=Logger.getLogger(ProcessDaoImpl.class);
	
		
	public boolean loginVerifaction(String username, String password) {

		boolean LOGIN_STATUS = Boolean.FALSE;

		// Get the Connection from DbUtils

		try {
			Connection conn = DbUtils.getConnection();
			Statement stmt = conn.createStatement();

			Integer countstatus = 0;
			ResultSet rs = stmt
					.executeQuery("select count(*) from login_ws_tbl as ts where ts.USERNAME='"
							+ username + "' and ts.PASSWORD='" + password + "'");
			while (rs.next()) {
				countstatus = rs.getInt("count(*)");
			}
			if (countstatus != 0) {
				LOGIN_STATUS = Boolean.TRUE;
			} else {
				LOGIN_STATUS = Boolean.FALSE;
			}
		} catch (Exception e) {
			LOGIN_STATUS = Boolean.FALSE;
		}

		return LOGIN_STATUS;
	}
	
		
	public UserInfoDTO getUserDetails(String username) {
		
		UserInfoDTO userInfoDTO=null;
		
		try {
			Connection conn = DbUtils.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from login_ws_tbl as ts where ts.USERNAME='"+username+"'");
			while (rs.next()) {
				userInfoDTO=new UserInfoDTO();
				userInfoDTO.setUsername(rs.getString("USERNAME"));
				userInfoDTO.setPassword(rs.getString("PASSWORD"));
				userInfoDTO.setCreateDate(rs.getDate("CREATED_DATE").toString());
				userInfoDTO.setEditDate(rs.getDate("EDITEDDATE").toString());
				
				return userInfoDTO;
			}

		}catch(Exception e){
			e.printStackTrace();
		}
		return userInfoDTO;
	}
}
