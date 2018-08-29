package com.sudarshan.day5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sudarshan.day5.Factorial;
import com.sudarshan.day5.exceptions.FactorialException;
import com.sudarshan.day5.exceptions.InvalidInputException;

class FactorialTest {

	@Test
	void testGetFactorialWithValidInput() throws InvalidInputException, FactorialException {
		assertEquals(120, Factorial.getFactorial(5));
		assertEquals(720, Factorial.getFactorial(6));
	}
	
	@Test
	void testGetFactorialWithInvalidInput() {
		assertThrows(InvalidInputException.class, ()->Factorial.getFactorial(-5));
	}
	
//	@Test
//	void testGetFactorialMaxCross() {
//		assertThrows(FactorialException.class, ()->Factorial.getFactorial(Integer.MAX_VALUE));
//	}


}
