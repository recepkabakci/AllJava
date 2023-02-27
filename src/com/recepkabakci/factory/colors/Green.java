package com.recepkabakci.factory.colors;

public class Green implements Color {

	@Override
	public void sayColorName() {
		System.out.println("Yemyeşil");
	}

	@Override
	public void info() {
		this.sayColorName();
	}

}
