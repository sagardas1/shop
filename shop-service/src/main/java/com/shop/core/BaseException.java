package com.shop.core;

public class BaseException extends RuntimeException {
	private int errorCode;
	private String errorMessage;
	private String errorDesc;
	private String statusCode;
	public BaseException(int errorCode, String errorMessage, String errorDesc,String statusCode) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.errorDesc = errorDesc;
		this.statusCode=statusCode;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public String getErrorDesc() {
		return errorDesc;
	}
	public String getStatusCode() {
		return statusCode;
	}
	
	
	
	
}
