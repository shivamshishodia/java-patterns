package com.shishodia.java.patterns.factory;

public class India implements Country {

	@Override
	public String getArea() {
		return "3.287 million km�";
	}

	@Override
	public String getCapital() {
		return "New Delhi";
	}

	@Override
	public String toString() {
		return getClassAsString();
	}
}
