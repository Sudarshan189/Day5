package com.sudarshan.day5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sudarshan.day5.MyCalculator;

class MyCalculatorTest {

	@Test
	void testPowerWithValidInputs() throws Exception {
		assertEquals(25, MyCalculator.power(5, 2));
		assertEquals(243, MyCalculator.power(3, 5));
		assertEquals(32, MyCalculator.power(2, 5));
//		Executable e  = () -> MyCalculator.power(0,0);
//		assertThrows(Exception.class, e);
	}

	@Test
	void testPowerWithZeroInputs() {
		Exception e;
		e = assertThrows(Exception.class, () -> MyCalculator.power(0, 0));
		assertEquals("java.lang.Exception: n and p should not be zero", e.toString());
	}

	@Test
	void testPowerWithNegetiveInputs() {
		Exception e;
		e = assertThrows(Exception.class, () -> MyCalculator.power(-8, 6));
		assertEquals("n and p should not be negetive", e.getMessage());
		e = assertThrows(Exception.class, () -> MyCalculator.power(-8, -6));
		assertEquals("n and p should not be negetive", e.getMessage());
		e = assertThrows(Exception.class, () -> MyCalculator.power(8, -6));
		assertEquals("n and p should not be negetive", e.getMessage());
	}

}
