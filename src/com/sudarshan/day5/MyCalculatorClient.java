package com.sudarshan.day5;

import java.util.Scanner;

import com.sudarshan.day5.exceptions.NegetiveNumberException;
import com.sudarshan.day5.exceptions.ZeroException;

public class MyCalculatorClient {
	public static void main(String[] args) {
		int n; 
		int p;
		MyCalculator calculator = new MyCalculator();
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter n and p");
			n = scanner.nextInt();
			p = scanner.nextInt();
			System.out.println(calculator.power(n, p));
		}
		catch(NegetiveNumberException | ZeroException e) {
			if(e instanceof NegetiveNumberException) 
				System.out.println(e.toString());
			
			if(e instanceof ZeroException)
				System.out.println(e.toString());
		}
		
		
	}
}
