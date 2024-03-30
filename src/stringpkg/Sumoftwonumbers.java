package stringpkg;

import java.util.Scanner;

public class Sumoftwonumbers {

	public static void main(String[] args) {
		
		//sum of digits in an integer
		
		int a,b,sum=0;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter numbers:");  
		a=sc.nextInt();  
		while(a>0)  
		{  
		 b=a%10;  
		 sum=sum+b;  
		 a=a/10;  
		}   
		System.out.println("Sum of digits: "+sum);  
		}  

}
