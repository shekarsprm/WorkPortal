package com.nit.webportal.helper;

import java.util.ResourceBundle;

public class LocationConstants {
	private static ResourceBundle CONFIG = ResourceBundle.getBundle("com.iwinner.location.utils.location");
	
	public static Integer LOCATION_DEFAULT_VALUE=00;
	public static Integer LOCATION_ID_EXISTS = 10;
	public static Integer LOCATION_ID_NOT_AVAIABLE = 11;
	public static Integer LOCATION_ID_INSERTED = 12;
	public static Integer LOCATION_ID_ERROR = 13;
	
	public static String LOCATION_MODIFED="Location Id Modified";
	public static String LOCATION_ERROR="Error Ocur Please contract admin";
	public static String LOCATION_CHANGE_DEFAULT="Default values";
	public static String LOCATION_ID_NOT_EXIST="Given Id not exist";

	public static String LOCATION_ACTIVATE="ACTIVE";
	public static String LOCATION_UPDATE="UPDATED";
	
	public static String LOCATION_DELETED="Location Deleted Successfully";
	public static String LOCATION_DELETED_ERROR="Location Deleted Error Occur,Please contact Admin";
	public static String LOCATION_DELETED_NOT_FOUND="Location Not Found";
	
	public static String SELECT_ALL_LOCATIONS=CONFIG.getString("SELECT_ALL_LOCATIONS");
	
	public static String UPDATE="opId02";
	public static String NEWUSER="opId01";
	public static Integer LOCATION_ID_UPDATED=10;
	public static Integer LOCATION_ID_UPDATED_ERROR=11;
	public static Integer LOCATION_ID_UPDATED_NOT_FOUND=12;
	public static Integer LOCATION_ID_NOT_FOUND=13;
	public static String SEMICOLON=";";
	
}
