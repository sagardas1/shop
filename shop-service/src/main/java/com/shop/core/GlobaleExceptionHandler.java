package com.shop.core;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobaleExceptionHandler {
	@ExceptionHandler(BaseException.class)
	public JsonResponce responce(BaseException e) {
		return new JsonResponce(String.valueOf(e.getErrorCode()), e.getErrorMessage(), e.getErrorDesc(), false, null, e.getStatusCode());
	}

}
