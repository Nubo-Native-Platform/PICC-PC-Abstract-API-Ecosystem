package com.nubons.nnp.sso.abs.exception;

/**
 * 
 * @author Gourab Guha
 *
 */
public class QueryParamMissingException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -874836242931036105L;

	public QueryParamMissingException() {
		super();
	}

	public QueryParamMissingException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public QueryParamMissingException(String message, Throwable cause) {
		super(message, cause);
	}

	public QueryParamMissingException(String message) {
		super(message);
	}

	public QueryParamMissingException(Throwable cause) {
		super(cause);
	}

}
