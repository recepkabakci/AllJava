package com.recepkabakci.abstractfactory;

import com.recepkabakci.factory.animals.AnimalFactory;
import com.recepkabakci.factory.colors.ColorFactory;
import com.recepkabakci.factory.shapes.ShapeFactory;

public class FactoryProducer {
	public static AbstractFactory produce(String factoryType) throws UnknownCreateableTypeException {
		if (factoryType.equalsIgnoreCase("renk")) {
			return new ColorFactory();
		}
		if (factoryType.equalsIgnoreCase("şekil")) {
			return new ShapeFactory();
		}
		if (factoryType.equalsIgnoreCase("hayvan")) {
			return new AnimalFactory();
		}
		throw new UnknownCreateableTypeException("Given factory type is not supported <<<" + factoryType + ">>>");
	}
}
