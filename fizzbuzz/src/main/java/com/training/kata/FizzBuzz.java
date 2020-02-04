package com.training.kata;

public class FizzBuzz {

	private static final String FIZZ_STRING = "fizz";
	private static final String BUZZ_STRING = "buzz";
	private static final String FIZZBUZZ_STRING = "fizzbuzz";
	
	private static final int DIVISIBLE_BY_NUMBER_3 = 3;
	private static final int DIVISIBLE_BY_NUMBER_5 = 5;
	private static final int DIVISIBLE_BY_NUMBER_15 = 15;

	public String divisible(int number) {

		if (number % DIVISIBLE_BY_NUMBER_15 == 0) {
			return FIZZBUZZ_STRING;
		}else if (number % DIVISIBLE_BY_NUMBER_3 == 0) {
			return FIZZ_STRING;
		} else if (number % DIVISIBLE_BY_NUMBER_5 == 0) {
			return BUZZ_STRING;
		} else {
			return String.valueOf(number);
		}

	}

}
