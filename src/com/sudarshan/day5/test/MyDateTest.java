package com.sudarshan.day5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sudarshan.day5.MyDate;
import com.sudarshan.day5.exceptions.InvalidDayException;
import com.sudarshan.day5.exceptions.InvalidMonthException;

class MyDateTest extends Exception {

	@Test
	void testMyDateWithValidInput() throws InvalidMonthException, InvalidDayException {
		assertNotNull(new MyDate(1,2,2016));
	}

	@Test
	void testMyDateWithInvalidDate()  {
//		assertNotNull(new MyDate(32,2,2016));
		assertThrows(InvalidDayException.class, ()->new MyDate(32,2,2016));
	}
	
	@Test
	void testMyDateWithInvalidMonth()  {
		assertThrows(InvalidMonthException.class, ()->new MyDate(30,15,2016));
	}
}
