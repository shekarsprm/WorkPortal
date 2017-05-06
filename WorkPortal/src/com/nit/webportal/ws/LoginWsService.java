package com.nit.webportal.ws;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.nit.webportal.vo.Response;


public interface LoginWsService extends Remote {

	
	public Response login(String username,String password,
			String appName,String appId)throws RemoteException;
	
}
