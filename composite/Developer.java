package com.shishodia.java.patterns.composite;

public class Developer implements Employee {
	
	private String name;
	
	public Developer(String name) {
		this.name = name;
	}
	
	@Override
	public void print() {
		System.out.println(name);
	}

}
