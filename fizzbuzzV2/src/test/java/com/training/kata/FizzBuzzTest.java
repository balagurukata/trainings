package com.training.kata;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
	public void newFizzBuzzInstanceShouldNotBeNull(){
		FizzBuzz fizzbuzz = new FizzBuzz();
		assertNotNull(fizzbuzz);
	}

}
