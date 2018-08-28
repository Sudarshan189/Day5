package com.sudarshan.day5;

import com.sudarshan.day5.exceptions.AgeNotWithinRangeException;
import com.sudarshan.day5.exceptions.NameNotValidException;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Student student = new Student(1234, "sudarshan", 00, "science");
		} catch (AgeNotWithinRangeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		} catch (NameNotValidException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}

}
