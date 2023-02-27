package com.recepkabakci.factory.animals;

import com.recepkabakci.abstractfactory.AbstractFactory;
import com.recepkabakci.abstractfactory.Createable;
import com.recepkabakci.abstractfactory.UnknownCreateableTypeException;

public class AnimalFactory extends AbstractFactory{

	@Override
	public Createable create(String animal) throws UnknownCreateableTypeException {
		if (animal.equalsIgnoreCase("kedi"))
			return new Cat();
		
		if (animal.equalsIgnoreCase("köpek"))
			return new Dog();
		
		if (animal.equalsIgnoreCase("kuş"))
			return new Bird();
		
		throw new UnknownCreateableTypeException("Desteklenmeyen hayvan"); // never do that: Exception'ların içine her zaman ingilizce mesaj yazılır
	}
}
