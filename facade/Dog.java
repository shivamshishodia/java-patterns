package com.shishodia.java.patterns.facade;

public class Dog implements Animal {

	@Override
	public void speak() {
		System.out.println("Dog Speaks :: Bow!! Bow!!");
	}

}
