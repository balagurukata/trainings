package com.training.kata;

public class FizzBuzz {

	private static final String STRING_BUZZ = "buzz";
	private static final int DIVISIBLE_NUMBER_3 = 3;
	private static final String STRING_FIZZ = "fizz";

	public String divisible(int divisibleNumber) {
		return (divisibleNumber % DIVISIBLE_NUMBER_3 == 0) ? STRING_FIZZ :STRING_BUZZ;
	}

}
