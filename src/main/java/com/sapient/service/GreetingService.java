package com.sapient.service;

public class GreetingService {

	private String defaultMessage = "Hello, World!";
	
	public String greet() {
		return defaultMessage;
	}

	public String greet(String name) {

		String msg = "Hello, ";

		if (name == null || name.trim().length() == 0) {
			msg += "friend!";
		} else {
			msg += name + "!";
		}

		return msg;

	}
}
