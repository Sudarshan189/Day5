package com.sudarshan.day5;

import com.sudarshan.day5.exceptions.CountryNotValidException;
import com.sudarshan.day5.exceptions.EmployeeNameInvalidException;
import com.sudarshan.day5.exceptions.TaxNotEligibleException;

public class TaxCalculatorClient {
	public static void main(String[] args) {

		TaxCalculator calculator = new TaxCalculator("Sudarshan", true, 50000);

		try {

			System.out.println(calculator.calculateTax());
		} catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
			if (e instanceof CountryNotValidException)
				System.out.println(e.toString());

			if (e instanceof EmployeeNameInvalidException)
				System.out.println(e.toString());

			if (e instanceof TaxNotEligibleException)
				System.out.println(e.toString());
		}
	}
}
