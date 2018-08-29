package com.sudarshan.day5;

import com.sudarshan.day5.exceptions.FactorialException;
import com.sudarshan.day5.exceptions.InvalidInputException;

public class Factorial {

	public Factorial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static int getFactorial(int num) throws InvalidInputException, FactorialException {
		int result = 0;
		if (num < 2) {
			throw new InvalidInputException("Invalid input given");
		}

		result = factorialFunction(num);

		if (result < 0) {
			throw new FactorialException("Integer range exceeds");
		}
		
		return result;

	}

	private static int factorialFunction(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
