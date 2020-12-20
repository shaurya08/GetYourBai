package com.bai.exception.service;

import com.bai.exception.BaiApplicationException;

public class BaiServiceException extends BaiApplicationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BaiServiceException() {
		super();
	}

	public BaiServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BaiServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public BaiServiceException(String message) {
		super(message);
	}

	public BaiServiceException(Throwable cause) {
		super(cause);
	}

}
