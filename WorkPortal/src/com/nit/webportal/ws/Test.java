package com.nit.webportal.ws;

import com.nit.webportal.utils.PropertiyRaderUtils;

public class Test {

	public static void main(String[] args) {
		
		String appId="2776";
	
		String APP_ID=PropertiyRaderUtils.getPropertiesValue("APP_ID_LIST");
		
		String appIds[]=APP_ID.split(",");
		
		System.out.println(APP_ID);
	}
}
