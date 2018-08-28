package com.sudarshan.day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sudarshan.day5.exceptions.AgeNotWithinRangeException;
import com.sudarshan.day5.exceptions.NameNotValidException;

public class Student {
	private long rollNo;
	private String name;
	private int age;
	private String course;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(long rollNo, String name, int age, String course)
			throws AgeNotWithinRangeException, NameNotValidException {

		if (age <= 15 || age > 21) {
			throw new AgeNotWithinRangeException("Age not in Range");
		}

		Pattern p = Pattern.compile("[a-zA-Z]*");
		Matcher m = p.matcher(name);

		if (!m.matches())
			throw new NameNotValidException("Name not valid");

		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.course = course;

		System.out.println("User Created");
	}

}
