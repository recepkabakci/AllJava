package com.recepkabakci.factory.shapes;

import com.recepkabakci.abstractfactory.UnknownCreateableTypeException;

public class UnknownShapeTypeException extends UnknownCreateableTypeException {
	private static final long serialVersionUID = 1L;

	public UnknownShapeTypeException(String message) {
		super(message);
	}
}
