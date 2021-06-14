package com.br.nikesh;

public class ExceptionHandlingExample4 {

	public static void main(String[] args) {
		try  
        {  
	        int arr[]= {1,3,5,7,10};  
	        System.out.println(arr[10]);	//may throw exception   
        }  
        // handling the array exception  
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("Hello!!");

	}

}
