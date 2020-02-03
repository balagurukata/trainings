package com.training.kata;

public class FizzBuzz {
	
	private static final String STR_FIZZ= "fizz";
	private static final int DIVISIBLE_BY_NUMBER_3 = 3;

	public String divisible(int number) {
		
		if(number % DIVISIBLE_BY_NUMBER_3 == 0) {
			return STR_FIZZ;
		}else {
			return String.valueOf(number);
		}
		
		
		
	}

}
