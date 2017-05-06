package com.nit.webportal.exceptions;

/**
 * The class ServiceException
 * 
 * @author Welcome
 * @version 1.x
 * @see com.iwinner.irpc.factory.expections.ServiceException.
 * @since Nov 15th,2016
 * 
 */
public class WsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WsException() {
		super();
	}

	public WsException(String message) {
		super(message);
	}

	public WsException(Throwable throwable) {
		super(throwable);
	}

	public WsException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
