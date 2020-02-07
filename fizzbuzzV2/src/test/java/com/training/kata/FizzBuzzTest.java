package com.training.kata;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
	public void newFizzBuzzInstanceShouldNotBeNull(){
		FizzBuzz fizzbuzz = new FizzBuzz();
		assertNotNull(fizzbuzz);
	}
	
	@Test
	public void shouldReturnFizzIfGivenNumberDivisiableBy3(){
		FizzBuzz fizzbuzz = new FizzBuzz();
		assertEquals("fizz", fizzbuzz.divisible(3));
	}

}
