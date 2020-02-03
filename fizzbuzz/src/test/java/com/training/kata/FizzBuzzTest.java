package com.training.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	private FizzBuzz fizzBuzz;
	
	private static final String STR_FIZZ= "fizz";
	
	@Before
	public void init() {
		fizzBuzz = new FizzBuzz();
	}
	
	@Test
	public void testShouldReturnFizzIfNumberDivisibleBy3() {
		assertEquals(STR_FIZZ, fizzBuzz.divisible(3));
	}

}
