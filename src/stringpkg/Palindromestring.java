package stringpkg;

import java.util.Scanner;

public class Palindromestring {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(s))
		{
		System.out.println("Palindrome");
		}
		else
		{
		System.out.println("not Palindrome");
		}
	}

}
