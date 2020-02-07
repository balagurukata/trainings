package com.training.kata;

public class FizzBuzz {

	private static final String STRING_FIZZ = "fizz";

	public String divisible(int divisibleNumber) {
		return (divisibleNumber % 3 == 0) ? STRING_FIZZ :"buzz";
	}

}
