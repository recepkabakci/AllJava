package com.recepkabakci.factory.colors;

public class Blue implements Color {

	@Override
	public void sayColorName() {
		System.out.println("Masvavi");
	}

	@Override
	public void info() {
		this.sayColorName();
	}
}
