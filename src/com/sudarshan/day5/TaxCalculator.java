package com.sudarshan.day5;

import com.sudarshan.day5.exceptions.CountryNotValidException;
import com.sudarshan.day5.exceptions.EmployeeNameInvalidException;
import com.sudarshan.day5.exceptions.TaxNotEligibleException;

public class TaxCalculator {

	

	public TaxCalculator() {
		super();
	}

	

	public static double calculateTax(String empName, boolean isIndian, double empSal)
			throws TaxNotEligibleException, EmployeeNameInvalidException, CountryNotValidException {
		double taxAmount;
		if ( empName == null || empName.equals("")) {
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		}

		if (!isIndian) {
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		}

		if (empSal >= 10_0_000) {
			taxAmount = empSal * (0.08);
		} else if (empSal >= 50000 && empSal < 100000) {
			taxAmount = empSal * (0.06);
		} else if (empSal >= 30000 && empSal < 50000) {
			taxAmount = empSal * (0.05);
		} else if (empSal >= 10000 && empSal < 30000) {
			taxAmount = empSal * (0.04);
		} else {
			throw new TaxNotEligibleException("The employee does not need to pay tax");
		}

		return taxAmount;

	}

}
