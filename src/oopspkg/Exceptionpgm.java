package oopspkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionpgm {

	public static void main(String[] args) throws FileNotFoundException {
		
	FileInputStream ip=new 	FileInputStream("E://Book1.x1sx");
		
		
		
	//run time exception,use try catch 
		
		try {
		int c=5/0;
		System.out.println(c);
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());	
			
		}
		System.out.println("hello");
	
	
	     //null pointer exception -running time
	
	try {
	String s=null;
	System.out.println("hello");
	}
	catch(NullPointerException e)
	{
		System.out.println("exception details");	
	}



	}
}




