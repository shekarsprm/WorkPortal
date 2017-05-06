package com.nit.webportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.nit.webportal.exceptions.DaoException;
import com.nit.webportal.utils.DbUtils;

public class LoginDaoImpl implements LoginDaoIF {

	public boolean loginStatus(String username, String password) throws DaoException {

		

		boolean LOGIN_STATUS = Boolean.FALSE;

		// Get the Connection from DbUtils

		try {
			Connection conn = DbUtils.getConnection();
			PreparedStatement stmt = conn.prepareStatement("select count(*) from login_ws_tbl as ts where ts.USERNAME=? and ts.PASSWORD=?");
            stmt.setString(1, username);
            stmt.setString(2, password);
            
            ResultSet rsmt=stmt.executeQuery();
			
            Integer countstatus = 0;
			
            while (rsmt.next()) {
				
				countstatus = rsmt.getInt("count(*)");
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
	
	public static void main(String[] args)throws DaoException {
		LoginDaoImpl ls=new LoginDaoImpl();
boolean status=ls.loginStatus("test11","test");
System.out.println(status);
	}
	
}
