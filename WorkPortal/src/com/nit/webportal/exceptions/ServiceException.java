package com.nit.webportal.exceptions;

/**
 * The class ServiceException
 * 
 * @author Welcome
 * @version 1.x
 * @see com.iwinner.location.ws.ServiceException.
 * @since Nov 4th,2016
 * 
 */

public class ServiceException extends Exception {

	private static final long serialVersionUID = 1L;


	public ServiceException() {
		super();
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Throwable throwable) {
		super(throwable);
	}

	public ServiceException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
