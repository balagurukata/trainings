package com.training.kata;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {

	private static final String STRING_FIZZBUZZ2 = "fizzbuzz";

	private static final int MIN_DIVISIBLE_BY_15 = 15;

	private static final int MAX_DIVISIBLE_BY_5 = 95;

	private static final int MIN_DIVISIBLE_BY_5 = 5;

	private static final int MAX_DIVISIBLE_BY_3 = 99;

	private static final int MIN_DIVISIBLE_BY_3 = 3;

	private static final String STRING_BUZZ = "buzz";

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
		assertEquals(STRING_FIZZ, fizzbuzz.divisible(MIN_DIVISIBLE_BY_3));
	}
	
	@Test
	public void shouldReturnFizzIf99NumberDivisibleBy3(){
		assertEquals(STRING_FIZZ, fizzbuzz.divisible(MAX_DIVISIBLE_BY_3));
	}
	
	@Test
	public void shouldReturnBuzzIfGivenNumberDivisibleBy5(){
		assertEquals(STRING_BUZZ, fizzbuzz.divisible(MIN_DIVISIBLE_BY_5));
	}
	
	@Test
	public void shouldReturnBuzzIf95NumberDivisibleBy5(){
		assertEquals(STRING_BUZZ, fizzbuzz.divisible(MAX_DIVISIBLE_BY_5));
	}
	
	@Test
	public void shouldReturnFizzBuzzIfGivenNumberDivisibleBy15(){
		assertEquals(STRING_FIZZBUZZ2, fizzbuzz.divisible(MIN_DIVISIBLE_BY_15));
	}

}
