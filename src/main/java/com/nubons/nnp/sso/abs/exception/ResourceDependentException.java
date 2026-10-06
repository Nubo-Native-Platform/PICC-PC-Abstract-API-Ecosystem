package com.nubons.nnp.sso.abs.exception;

/**
 * 
 * @author Gourab Guha
 *
 */
public class ResourceDependentException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7743265468129563952L;

	public ResourceDependentException() {
		super();
	}

	public ResourceDependentException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ResourceDependentException(String message, Throwable cause) {
		super(message, cause);
	}

	public ResourceDependentException(String message) {
		super(message);
	}

	public ResourceDependentException(Throwable cause) {
		super(cause);
	}

}
