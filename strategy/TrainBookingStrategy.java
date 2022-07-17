package com.shishodia.java.patterns.strategy;

public class TrainBookingStrategy implements BookingStrategy {

	@Override
	public double getFare() {
		return 8.5;
	}

	@Override
	public String toString(){
		return "TrainBookingStrategy";
	}	
}
