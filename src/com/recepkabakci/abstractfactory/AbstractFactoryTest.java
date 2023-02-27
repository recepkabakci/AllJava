package com.recepkabakci.abstractfactory;

import com.recepkabakci.factory.animals.Animal;
import com.recepkabakci.factory.colors.Color;
import com.recepkabakci.factory.shapes.Shape;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		try {
			AbstractFactory factory = FactoryProducer.produce("renk");
			Createable c = factory.create("kırmızı");
			((Color)c).sayColorName();
			
			factory = FactoryProducer.produce("şekil");
			c = factory.create("kare");
			((Shape)c).draw();
			
			factory = FactoryProducer.produce("hayvan");
			c = factory.create("kuş");
			((Animal)c).giveSound();
			
			c.info();
		}
		catch (UnknownCreateableTypeException ex) {
			ex.printStackTrace();
		}

	}

}
