package com.sudarshan.day5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sudarshan.day5.TaxCalculator;
import com.sudarshan.day5.exceptions.CountryNotValidException;
import com.sudarshan.day5.exceptions.EmployeeNameInvalidException;
import com.sudarshan.day5.exceptions.TaxNotEligibleException;

class TaxCalculatorTest {
	@Test
	void testCalculateWithValidInputs()
			throws TaxNotEligibleException, EmployeeNameInvalidException, CountryNotValidException {
//		assertEquals(3000, taxCalculate.calculateTax());
		assertEquals(3300, TaxCalculator.calculateTax("Jack", true, 55000), 0.3);
	}

	@Test
	void taxCalculateWithInvalidName() {
		Exception e;
		e = assertThrows(EmployeeNameInvalidException.class, () -> TaxCalculator.calculateTax("", true, 30000));
		assertEquals("The employee name cannot be empty", e.getMessage());
		e = assertThrows(EmployeeNameInvalidException.class, () -> TaxCalculator.calculateTax(null, true, 30000));
		assertEquals("The employee name cannot be empty", e.getMessage());
	}

	@Test
	void taxCalculateWithIneligible() {
		Exception e;
		e = assertThrows(TaxNotEligibleException.class, () -> TaxCalculator.calculateTax("Tim", true, 1000));
		assertEquals("The employee does not need to pay tax", e.getMessage());
	}

	@Test
	void taxCalculateWithInvalidCountry() {
		Exception e;
		e = assertThrows(CountryNotValidException.class, () -> TaxCalculator.calculateTax("Ron", false, 34000));
		assertEquals("The employee should be an Indian citizen for calculating tax", e.getMessage());
	}

}
