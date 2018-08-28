package com.sudarshan.day5;

import com.sudarshan.day5.exceptions.CountryNotValidException;
import com.sudarshan.day5.exceptions.EmployeeNameInvalidException;
import com.sudarshan.day5.exceptions.TaxNotEligibleException;

public class TaxCalculator {
	private String empName;
	private boolean isIndian;
	private double empSal;

	private double taxAmount;

	public TaxCalculator() {
		super();
	}

	public TaxCalculator(String empName, boolean isIndian, double empSal) {
		this.empName = empName;
		this.isIndian = isIndian;
		this.empSal = empSal;
	}

	public double calculateTax()
			throws TaxNotEligibleException, EmployeeNameInvalidException, CountryNotValidException {
		if (empName.equals("") || empName == null) {
			throw new EmployeeNameInvalidException("Employee Nmae Cannot be empty");
		}

		if (!isIndian) {
			throw new CountryNotValidException("Employee should be Indian");
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
