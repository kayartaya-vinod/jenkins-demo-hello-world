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

}
