package controlstmts;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int temp=n;
		
		int rem;
		int rev=0;
		
		while(n>0)
		{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		}
		System.out.println(rev);
		if(temp==rev)
		{
		System.out.println("Palindrome");
		}
		else
		{
		System.out.println("not Palindrome");
		}

	}

}
