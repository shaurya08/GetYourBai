package com.bai.exception;

public class BaiApplicationException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BaiApplicationException() {
		super();
	}

	public BaiApplicationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BaiApplicationException(String message, Throwable cause) {
		super(message, cause);
	}

	public BaiApplicationException(String message) {
		super(message);
	}

	public BaiApplicationException(Throwable cause) {
		super(cause);
	}

}
