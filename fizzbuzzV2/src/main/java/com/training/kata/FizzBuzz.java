package com.training.kata;

import java.util.Optional;

public class FizzBuzz {

	private static final String STRING_BUZZ = "buzz";
	private static final int DIVISIBLE_NUMBER_3 = 3;
	private static final int DIVISIBLE_NUMBER_5 = 5;
	private static final String STRING_FIZZ = "fizz";

	public String divisible(int divisibleNumber) {
		return Optional.of(divisibleNumber).map(divNum -> (divNum % DIVISIBLE_NUMBER_3 == 0 ? STRING_FIZZ : "")
				+ (divNum % DIVISIBLE_NUMBER_5 == 0 ? STRING_BUZZ : "")).get();
	}

}
