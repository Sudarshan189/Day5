package com.sudarshan.day5;

public class MyCalculator {
	public MyCalculator() {
		super();
	}

	public static long power(int n, int p) throws Exception {
		long result = 1;
		if (n < 0 || p < 0) {
			throw new Exception("n and p should not be negetive");
		} else if (n == 0 && p == 0) {
			throw new Exception("n and p should not be zero");
		}

		for (int i = 1; i <= p; i++) {
			result = result * n;
		}

		return result;
	}
}
