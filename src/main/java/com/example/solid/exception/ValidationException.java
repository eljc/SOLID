package com.example.solid.exception;

public class ValidationException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ValidationException(String msg) {
		super(msg);
	}
	

}
