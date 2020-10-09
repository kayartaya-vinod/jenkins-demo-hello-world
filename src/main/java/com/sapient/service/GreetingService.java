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

	public String greet(String name, String city) {
		String msg = "Hello %s, how's weather in %s?";
		if (name == null || name.trim().length() == 0) {
			name = "friend";
		}
		if (city == null || city.trim().length() == 0) {
			city = "your city";
		}

		return String.format(msg, name, city);
	}
}
