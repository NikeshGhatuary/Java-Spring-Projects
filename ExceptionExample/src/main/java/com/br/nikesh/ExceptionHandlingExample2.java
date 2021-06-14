package com.br.nikesh;

public class ExceptionHandlingExample2 {

	public static void main(String[] args) {
		try
		{
			int a = 100/0;	//may throw an exception
		}
		// handling the exception with parent class Exception
		catch(Exception e)
		{
			System.out.println("Cant'n divide by zero.");
		}

	}

}
