package com.sudarshan.day5;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	/// leap year 366
	/// not leap year 365
	
		
		this.day = day;
		this.month = month;
		this.year = year;

	}

	private boolean checkLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				// year is divisible by 400, hence the year is a leap year
				if (year % 400 == 0)
					return true;
				else
					return false;
			} else
				return true;
		} else
			return false;
	}

}
