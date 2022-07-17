package com.shishodia.java.patterns.command.concrete;

import com.shishodia.java.patterns.command.Command;
import com.shishodia.java.patterns.command.receiver.Order;

//Concrete Command
public class CommandServeOrder implements Command {

	private Order order;
	
	public CommandServeOrder(Order order) {
		this.order = order;
	}
	
	@Override
	public void execute() {
		this.order.setOrderServed(true);
		System.out.println(this.order);
	}

}
