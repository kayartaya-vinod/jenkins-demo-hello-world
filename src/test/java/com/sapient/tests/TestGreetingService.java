package com.sapient.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sapient.service.GreetingService;

class TestGreetingService {

	GreetingService service;

	@BeforeEach // Junit 4 --> @Before
	void init() {
		service = new GreetingService();
	}

	@AfterEach // Junit 4 --> @After
	void cleanUp() {

	}

	@Test
	void testGreetNoArg() {
		String actual = service.greet();
		String expected = "Hello, World!";
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void testGreetForValidName() {
		String actual = service.greet("Vinod");
		String expected = "Hello, Vinod!";
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void testGreetForNull() {
		String actual = service.greet(null);
		String expected = "Hello, friend!";
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void testGreetForEmptyString() {
		String actual = service.greet("");
		String expected = "Hello, friend!";
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void testGreetForValidNameAndCity() {
		String expected = "Hello Vinod, how's weather in Bangalore?";
		String actual = service.greet("Vinod", "Bangalore");
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void testGreetForValidNameAndNullCity() {
		String expected = "Hello Vinod, how's weather in your city?";
		String actual = service.greet("Vinod", null);
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void testGreetForValidNameAndEmptyCity() {
		String expected = "Hello Vinod, how's weather in your city?";
		String actual = service.greet("Vinod", "");
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void testGreetForEmmptyNameAndEmptyCity() {
		String expected = "Hello friend, how's weather in your city?";
		String actual = service.greet("", "");
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void testGreetForEmmptyNameAndValidCity() {
		String expected = "Hello friend, how's weather in Bangalore?";
		String actual = service.greet("", "Bangalore");
		Assertions.assertEquals(expected, actual);
	}
	

	@Test
	void testGreetForNullNameAndValidCity() {
		String expected = "Hello friend, how's weather in Bangalore?";
		String actual = service.greet(null, "Bangalore");
		Assertions.assertEquals(expected, actual);
	}
	

	@Test
	void testGreetForNullNameAndNullCity() {
		String expected = "Hello friend, how's weather in your city?";
		String actual = service.greet(null, null);
		Assertions.assertEquals(expected, actual);
	}


}
