package controlstmts;

import java.util.Scanner;

public class Primenumberqn {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number");
	    int n=sc.nextInt();
		int c=0;
        if(n<=1) 
        {
	      System.out.println("it is not a prime number");
	    }
        for(int i=1;i<=n/2;i++) 
        {
	      if(n%i==0) 
	      {
	        c++;
	      }
	    }
           if(c>1) 
           {
	        System.out.println("it is not a prime number");
	       }
	         else 
	          {
	            System.out.println("it is a prime number");
	          }

	}

}
