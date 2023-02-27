package com.recepkabakci.abstractfactory;

public abstract class AbstractFactory {
	public abstract Createable create(String type) throws UnknownCreateableTypeException;
}
