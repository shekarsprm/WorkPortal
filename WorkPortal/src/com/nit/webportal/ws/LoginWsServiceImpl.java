package com.nit.webportal.ws;

import java.rmi.RemoteException;

import org.apache.log4j.Logger;

import com.nit.webportal.factory.ServiceFactory;
import com.nit.webportal.service.LoginServiceIF;
import com.nit.webportal.utils.DateUtils;
import com.nit.webportal.utils.PropertiyRaderUtils;
import com.nit.webportal.utils.TACGenerator;
import com.nit.webportal.vo.Response;




public class LoginWsServiceImpl implements LoginWsService {

	private static Logger LOGGERS = Logger.getLogger("common");
	private static Logger EDRS = Logger.getLogger("common1");
	private LoginServiceIF loginServiceIF;

	public Response login(String username, String password, String appName, String appId) throws RemoteException {
		LOGGERS.info("Enter into the login operation");
		String generatedId = TACGenerator.generateOTP(8);
		EDRS.info("LOG_REQ" + "|" + generatedId + "|" + username + "|" + password + "|" + appName + "|" + appId + "|"
				+ DateUtils.processTimestampYYYYMMDD());
		
		Response response = new Response();
		loginServiceIF = ServiceFactory.getLoginFactory();
		String isValid = validateParams(username, password, appName, appId);
		if ("0".equalsIgnoreCase(isValid)) {
			if (username == null) {
				response.setStatusCode("10");
				response.setStatusMessage("Username is man");
			} else {
				response.setStatusCode("0");
				response.setStatusMessage("SUCCESS");
			}

		} else {
			response.setStatusCode(isValid);
			response.setStatusMessage(PropertiyRaderUtils.getPropertiesValue(isValid));
			EDRS.info("LOG_RES" + "|" + generatedId + "|" + isValid + "|"
					+ PropertiyRaderUtils.getPropertiesValue(isValid) + "|" + DateUtils.processTimestampYYYYMMDD());
			LOGGERS.info("Exit into the login operation");
		}

		return response;
	}

	public String validateParams(String username, String password, String appName, String appId){

		if(username==null || username.isEmpty()){
			return "1";
		}
		
		if(password==null || password.isEmpty()){
			return "2";
		}
		
		if(appName==null || appName.isEmpty()){
			return "3";
		}
		
		
       String confAppName[]=PropertiyRaderUtils.getPropertiesValue("APP_NAME").
    		   split(",");
		
		boolean statusName=false;
		for (String string : confAppName) {
		    if(string.equalsIgnoreCase(appName)){
		    	statusName=true;
	            break;
	    }else{
	    	statusName=false;
	    }
		    
		}
		    if(!statusName){
		    	return "5";
		    }
		
		    if(appId==null || appId.isEmpty()){
				return "4";
			}
		
		    String confIDName[]=PropertiyRaderUtils.getPropertiesValue("APP_ID").split(",");
				boolean statusId=false;
				for (String stringId : confIDName) {
				    if(stringId.equalsIgnoreCase(appId)){
				    	statusId=true;
			            break;
			    }else{
			    	statusId=false;
			    }
				    
				}
				    if(!statusId){
				    	return "6";
				    }
				    
		    
		
		
		return "0";
		
	
	}
	
}