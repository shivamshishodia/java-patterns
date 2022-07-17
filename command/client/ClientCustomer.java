package com.shishodia.java.patterns.command.client;

import com.shishodia.java.patterns.command.concrete.CommandCookOrder;
import com.shishodia.java.patterns.command.concrete.CommandPlaceOrder;
import com.shishodia.java.patterns.command.concrete.CommandServeOrder;
import com.shishodia.java.patterns.command.concrete.CommandValidateOrder;
import com.shishodia.java.patterns.command.invoker.Cook;
import com.shishodia.java.patterns.command.invoker.Manager;
import com.shishodia.java.patterns.command.invoker.Waiter;
import com.shishodia.java.patterns.command.receiver.Order;

//Client
public class ClientCustomer {
	
	public ClientCustomer() {

		Order myOrder = new Order("Veg Burger", 2);
		
		
		//Place Order
		CommandPlaceOrder cmdPlaceOrder = new CommandPlaceOrder(myOrder);
		
		Waiter waiter = new Waiter();
		waiter.setCommand(cmdPlaceOrder);
		waiter.takeOrder();
		
		
		//Validate Order
		CommandValidateOrder cmdValidateOrder = new CommandValidateOrder(myOrder);
		
		Manager manager = new Manager();
		manager.setCommand(cmdValidateOrder);
		manager.validateOrder();
		
		CommandCookOrder cmdCookOrder = new CommandCookOrder(myOrder);
		
		Cook cook = new Cook();
		cook.setCommand(cmdCookOrder);
		cook.prepareOrder();
		

		CommandServeOrder cmdServeOrder = new CommandServeOrder(myOrder);
		
		waiter.setCommand(cmdServeOrder);
		waiter.serveOrder();
	}

}
