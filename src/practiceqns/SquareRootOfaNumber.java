package practiceqns;

import java.util.Scanner;

public class SquareRootOfaNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		System.out.println("Square root of "+n+" is: "+squareRoot(n));
	}
		private static double squareRoot(int n) {
			double temp;  
	        double sqrtroot=n/2;  
	        do   
	        {  
	            temp=sqrtroot;  
	            sqrtroot=(temp+(n/temp))/2;  
	        }   
	        while((temp-sqrtroot)!= 0);  
	        return sqrtroot;  
			
			
			
			
	
	}

}
