package com.nubons.nnp.sso.abs.exception;

/**
 * 
 * @author Gourab Guha
 *
 */
public class BadRequestException extends RuntimeException {
	private static final long serialVersionUID = 6467738943339421205L;

	public BadRequestException() {
		super();
	}

	public BadRequestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BadRequestException(String message, Throwable cause) {
		super(message, cause);
	}

	public BadRequestException(String message) {
		super(message);
	}

	public BadRequestException(Throwable cause) {
		super(cause);
	}

}
