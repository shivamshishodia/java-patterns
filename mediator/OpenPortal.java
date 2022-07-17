package com.shishodia.java.patterns.mediator;

import java.util.Date;

public class OpenPortal {
	
	public static void showMessage(String message, PortalUser sender) {
		 System.out.println(new Date().toString() + " [" + sender.getName() + "] : " + message);
	}

}
