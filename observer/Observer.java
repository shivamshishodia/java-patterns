package com.shishodia.java.patterns.observer;

abstract class Observer {
	
	protected Topic topic;

	public abstract void update();
}