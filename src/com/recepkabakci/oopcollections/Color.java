package com.recepkabakci.oopcollections;

public enum Color {
	GREY("gri"), BLACK("siyah"), WHITE("beyaz");

	private String color;

	Color(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
}
