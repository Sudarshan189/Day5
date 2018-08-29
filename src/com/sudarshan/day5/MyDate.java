package com.sudarshan.day5;

import com.sudarshan.day5.exceptions.InvalidDayException;
import com.sudarshan.day5.exceptions.InvalidMonthException;

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
	
	public MyDate(int date, int month, int year) throws InvalidMonthException, InvalidDayException {
		if(date<1   ||  ((month==2)  &&  (year%4==0) && (date>29)) || ((month==2)  &&  (year%4!=0) && (date>28)) || 
				((month==01||month==03||month==5||month==7||month==8||month==10||month==12)&&(date>31)) ||(date>30))
			throw new InvalidDayException(("Date is invalid"));
			
		if(month<1 || month>12)
			throw new InvalidMonthException("Month is invalid");
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
