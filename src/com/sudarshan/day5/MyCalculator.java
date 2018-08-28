package com.sudarshan.day5;

import com.sudarshan.day5.exceptions.NegetiveNumberException;
import com.sudarshan.day5.exceptions.ZeroException;

public class MyCalculator {

	private int n;
	private int p;

	public MyCalculator() {
		super();
	}

	

	public long power(int n, int p) throws NegetiveNumberException, ZeroException {
		if (n < 0 || p < 0) {
			throw new NegetiveNumberException("n and p should not be negetive");
		} else if (n == 0 || p == 0) {
			throw new ZeroException("n and p should not be zero");
		}
		return (long) Math.pow(n, p);
	}
}
