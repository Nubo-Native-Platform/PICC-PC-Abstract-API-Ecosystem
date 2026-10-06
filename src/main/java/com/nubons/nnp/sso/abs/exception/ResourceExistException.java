package com.nubons.nnp.sso.abs.exception;

public class ResourceExistException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3679040647451789475L;
	
	public ResourceExistException() {
		super();
	}

	public ResourceExistException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ResourceExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public ResourceExistException(String message) {
		super(message);
	}

	public ResourceExistException(Throwable cause) {
		super(cause);
	}


}
