package controlstmts;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		//prime number
		
	 Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
     int n=sc.nextInt();
     int a=0;
     for(int i=2;i<=n/i;i++)
      {
           if ((n%i)==0) 
           {
        	   a=1;
           }
           else
        	   {
        	   System.out.println("Prime number");
        	   }
	  if(a==0)
	  {
		  System.out.println("not a prime number");  
	  }
      }
   }
}     