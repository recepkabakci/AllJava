package com.recepkabakci.abstractfactory;

public class UnknownCreateableTypeException extends Exception {
	private static final long serialVersionUID = 1L;

	public UnknownCreateableTypeException(String message) {
		super(message);
	}
}
