package com.br.nikesh;

public class ExceptionHandlingExample3 {

	public static void main(String[] args) {
		int i=100;  
        int j=0;  
        int data;  
        try  
        {  
        	data=i/j; //may throw exception
        }  
        //handling the exception with generated exception type  
        catch(ArithmeticException e)  
        {  
        	//resolving the exception in catch block
            System.out.println(i/(j+2));  
        }

	}

}
