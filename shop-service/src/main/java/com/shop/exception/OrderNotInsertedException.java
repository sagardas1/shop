package com.shop.exception;

import com.shop.core.BaseException;

public class OrderNotInsertedException extends BaseException{

	public OrderNotInsertedException(int errorCode, String errorMessage, String errorDesc, String statusCode) {
		super(errorCode, errorMessage, errorDesc, statusCode);
		
	}

}
