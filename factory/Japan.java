package com.shishodia.java.patterns.factory;

public class Japan implements Country {

	@Override
	public String getArea() {
		return "377,962 km�";
	}

	@Override
	public String getCapital() {
		return "Tokyo";
	}

	@Override
	public String toString() {
		return getClassAsString();
	}
}
