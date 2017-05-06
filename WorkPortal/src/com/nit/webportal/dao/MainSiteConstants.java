package com.nit.webportal.dao;

import com.nit.webportal.utils.PropertiyRaderUtils;

public class MainSiteConstants {
	
	public static String USERS_CRED_EMPTY="Please enter Username and password";
	public static final String DEFAULT_STRING_INITIALIZATION = "";
	public static final String DOT = ".";
	public static final String COMMA_DELIMITER = ",";
	public static final String UNDERSCORE = "_";
	public static final String COLON = ":";
	public static final String PIPE = "|";
	public static final String SEMI_COLON = ";";
	public static final String HIPHEN = "-";
	public static final String SPACE = " ";
	public static final Integer DEFAULT_ZERO_ITEM=0;

	
	public static String YYYYMMDD=PropertiyRaderUtils.getPropertiesValue("YYYYMMDD");
	public static String USER_AGENT = PropertiyRaderUtils.getPropertiesValue("USER_AGENT");
	public static String FORWARD_SLASH = PropertiyRaderUtils.getPropertiesValue("FORWARD_SLASH");
	public static String CHROME_BROWSER = PropertiyRaderUtils.getPropertiesValue("CHROME_BROWSER");
	public static String INTERNETEXPLORE_BROWSER = PropertiyRaderUtils.getPropertiesValue("INTERNET_EXPLORE_BROWSER");
	public static String FIREFOX_BROWSER = PropertiyRaderUtils.getPropertiesValue("FIREFOX_BROWSER");
	public static String OS_NAME = PropertiyRaderUtils.getPropertiesValue("OS_NAME");
    public static String INPUT_IMG_LOCATION=PropertiyRaderUtils.getPropertiesValue("INPUT_IMG_LOCATION");
	
	public static Integer DATE_CORRECT=1000;
	public static Integer DATE_EXPIRED=1001;
	public static Integer DATE_EQUAL=1002;

	public static Integer ACTIVE_STATUS=2000;
	public static Integer INACTIVE_STATUS=2001;
	public static Integer DISABLE_STATUS=2002;

	public static Integer LOGIN_SUCCESS=3000;
	public static Integer LOGIN_FAILED=30001;
	
	public static Integer PASSWORD_DISABLE_TODAY=4000;
	
	public static Integer ADMIN_ROLE_ID=5000;
	public static Integer NORMA_USER_ID=50001;
	public static Integer HR_USER_ID=5002;
	public static Integer CUSTOMER_USER_ID=5003;
	public static Integer PASSWORD_BLOCKED=5004;
	
	public static Integer DEFAULT_ZERO=0;
	public static Integer UPDATE_PASSWORD_SUCCESS=Integer.parseInt(PropertiyRaderUtils.getPropertiesValue("UPDATE_PASSWORD_SUCCESS"));
	public static Integer UPDATE_PASSWORD_FAILED=Integer.parseInt(PropertiyRaderUtils.getPropertiesValue("UPDATE_PASSWORD_FAILED"));
	public static Integer UPDATE_PASSWORD_CURRENT_PASSWORD_INCORRECT=Integer.parseInt(PropertiyRaderUtils.getPropertiesValue("UPDATE_PASSWORD_CURRENT_PASSWORD_INCORRECT"));
	
	
	
	//SQL QUERIES
	public static String INSERT_AUDIT_QUERY=PropertiyRaderUtils.getPropertiesValue("INSERT_QUERY");
	public static String SELECT_USER_VERIFY=PropertiyRaderUtils.getPropertiesValue("SELECT_USER_VERIFY");
	public static String SELECT_USER_DETAILS=PropertiyRaderUtils.getPropertiesValue("SELECT_USER_INFO");
	public static String SELECT_LAST_HITS_COUNT=PropertiyRaderUtils.getPropertiesValue("SELECT_COUNT_HITS");
	public static String UPDATE_LOGIN_COUNT=PropertiyRaderUtils.getPropertiesValue("UPDATE_LOGIN_COUNT");
	public static String UPDATE_LAST_LOGIN_TIMES=PropertiyRaderUtils.getPropertiesValue("UPDATE_LAST_LOGIN_TIMES");
	public static String UPDATE_CONSERTIVE_FAILUR=PropertiyRaderUtils.getPropertiesValue("UPDATE_CONSERTIVE_FAILUR");
	public static String SELECT_CONSERTIVE_FAILURE_COUNT=PropertiyRaderUtils.getPropertiesValue("SELECT_CONSERTIVE_FAILURE_COUNT");
	public static String UPDATE_CONSERTIVE_SUCCESS=PropertiyRaderUtils.getPropertiesValue("UPDATE_CONSERTIVE_SUCCESS");
	public static String UPDATE_CONSERTIVE_FAILURE_ZERO=PropertiyRaderUtils.getPropertiesValue("UPDATE_CONSERTIVE_FAILURE_ZERO");
	
		
	// SQL QUERIES
	public static final String INSERT_VISTIOR_INFO =PropertiyRaderUtils.getPropertiesValue("INSERT_VISTIOR_INFO");
	public static String UPDATE_PASSWORD=PropertiyRaderUtils.getPropertiesValue("UPDATE_PASSWORD");
	public static String UPDATE_ADMIN_INFO=PropertiyRaderUtils.getPropertiesValue("UPDATE_ADMIN_INFO");
	public static String INSERT_QUESTION_QUERY=PropertiyRaderUtils.getPropertiesValue("INSERT_QUESTION_QUERY");
	public static String SELECT_QUESTIONS=PropertiyRaderUtils.getPropertiesValue("SELECT_QUESTIONS");
	public static Integer COUNT_PLUS=1;
	public static Integer COUNT_ZERO=0;
	

	
}
