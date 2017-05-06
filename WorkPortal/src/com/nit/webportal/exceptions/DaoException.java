package com.nit.webportal.exceptions;

/**
 * The class ServiceException
 * 
 * @author Welcome
 * @version 1.x
 * @see com.iwinner.location.ws.expetions.ServiceException.
 * @since Nov 4th,2016
 * 
 */

public class DaoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DaoException() {
		super();
	}

	public DaoException(String message) {
		super(message);
	}

	public DaoException(Throwable throwable) {
		super(throwable);
	}

	public DaoException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
