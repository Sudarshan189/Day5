package com.sudarshan.day5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sudarshan.day5.Student;
import com.sudarshan.day5.exceptions.AgeNotWithinRangeException;
import com.sudarshan.day5.exceptions.NameNotValidException;

class StudentTest {
	Student student;

	@Test
	void testStudentWithValidAge() throws AgeNotWithinRangeException, NameNotValidException {
		
		assertNotNull(new Student(1234, "sudarshan", 16, "kool"));
	}

	@Test
	void testWithInvalidAge() {
		assertThrows(AgeNotWithinRangeException.class, () -> new Student(1234, "sudarshan", 14, "kool"));
	}

	@Test
	void testWithInvalidName() {
		assertThrows(NameNotValidException.class, () -> new Student(1234, "asgh5", 16, "kool"));
	}

}
