package practiceqns;

import java.util.Scanner;

public class FactorialOfaNumber {

	public static void main(String[] args) {
		
//1		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		int Factorial=fact(a);
		System.out.println("Factorial of a number:"+Factorial);
	}

    static int fact(int n) {
		  int output=0;
	if(n==1) 
	    {
	      return 1;	
		}		  output=fact(n-1)*n;
	      return output;
		
	}
 
 //2
 /*   
     Scanner sc=new Scanner(System.in);
	  long fact=1;  
	  System.out.println("Enter number:");
	  int numbers=sc.nextInt();  
	  for(int i=1;i<=numbers;++i){    
	      fact=fact*i;    
	  }    
	  System.out.println("Factorial of "+numbers+" is: "+fact);    
	 }  

//3

    int num = 5, i1 = 1;
    long factorial=1;
    while(i <= num)
{
    factorial *= i1;
    i1++;
}
System.out.printf("Factorial of %d = %d", num, factorial);
}


*/





}
 
