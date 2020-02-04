package com.training.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	private FizzBuzz fizzBuzz;
	
	private static final String FIZZ_STRING= "fizz";
	private static final String BUZZ_STRING= "buzz";
	private static final String FIZZBUZZ_STRING= "fizzbuzz";
	
	@Before
	public void init() {
		fizzBuzz = new FizzBuzz();
	}
	
	@Test
	public void testShouldReturnFizzIfNumberDivisibleBy3() {
		assertEquals(FIZZ_STRING, fizzBuzz.divisible(3));
		assertEquals(FIZZ_STRING, fizzBuzz.divisible(6));
		assertEquals(FIZZ_STRING, fizzBuzz.divisible(9));
	}

	@Test
	public void testShouldReturnBuzzIfNumberDivisibleBy5() {
		assertEquals(BUZZ_STRING, fizzBuzz.divisible(5));
		assertEquals(BUZZ_STRING, fizzBuzz.divisible(50));
	}
	
	@Test
	public void testShouldReturnFizzBuzzIfNumberDivisibleBy15() {
		assertEquals(FIZZBUZZ_STRING, fizzBuzz.divisible(15)); 
		assertEquals(FIZZBUZZ_STRING, fizzBuzz.divisible(30));
	}
	
}
