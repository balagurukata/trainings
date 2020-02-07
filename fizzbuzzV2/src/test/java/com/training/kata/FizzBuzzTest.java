package com.training.kata;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {

	private static final String STRING_FIZZ = "fizz";

	private FizzBuzz fizzbuzz;

	@Before
	public void init() {
		fizzbuzz = new FizzBuzz();
	}

	@Test
	public void newFizzBuzzInstanceShouldNotBeNull() {
		assertNotNull(fizzbuzz);
	}

	@Test
	public void shouldReturnFizzIfGivenNumberDivisiableBy3() {
		assertEquals(STRING_FIZZ, fizzbuzz.divisible(3));
	}

}
