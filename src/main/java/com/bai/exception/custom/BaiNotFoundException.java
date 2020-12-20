package com.bai.exception.custom;

import com.bai.exception.service.BaiServiceException;

public class BaiNotFoundException extends BaiServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BaiNotFoundException() {
		super();
	}

	public BaiNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BaiNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public BaiNotFoundException(String message) {
		super(message);
	}

	public BaiNotFoundException(Throwable cause) {
		super(cause);
	}

}
