package com.shop.core;

import java.io.Serializable;

public class JsonResponce implements Serializable{
	
	private String errorCode;
	private String errorMessage;
	private String errorDesc;
	private boolean status;
	private Object data;
	private String statusCode;
	public JsonResponce(String errorCode, String errorMessage, String errorDesc, boolean status, Object data,String statusCode) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.errorDesc = errorDesc;
		this.status = status;
		this.data = data;
		this.statusCode=statusCode;
	}
	
	public static JsonResponce getResponse(String errorCode, String errorMessage, String errorDesc, boolean status, Object data,String statusCode) {
		JsonResponce jsonResponce = new JsonResponce(errorCode, errorMessage, errorDesc, status, data, statusCode);
		return jsonResponce;
		
	}
	
	
}
