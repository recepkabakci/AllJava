package com.recepkabakci.factory.colors;

import com.recepkabakci.abstractfactory.UnknownCreateableTypeException;

public class UnknownColorNameException extends UnknownCreateableTypeException {
	private static final long serialVersionUID = 1L;

	public UnknownColorNameException(String message) {
		super(message);
	}

}
