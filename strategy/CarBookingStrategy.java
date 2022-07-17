package com.shishodia.java.patterns.strategy;

public class CarBookingStrategy implements BookingStrategy {

	@Override
	public double getFare() {
		return 12.5;
	}
	
	@Override
	public String toString(){
		return "CarBookingStrategy";
	}
}
