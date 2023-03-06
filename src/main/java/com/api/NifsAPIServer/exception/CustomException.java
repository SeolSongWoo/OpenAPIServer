package com.api.NifsAPIServer.exception;

import com.api.NifsAPIServer.response.error.ErrorCode;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException{
	
	private ErrorCode errorCode;
	
	public CustomException(final String message, final ErrorCode errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

}
