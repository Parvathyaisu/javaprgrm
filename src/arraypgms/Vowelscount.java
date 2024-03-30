package arraypgms;

import java.util.Scanner;

public class Vowelscount {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Vowelscount v=new Vowelscount();
		int count=v.vowelCount(s);
		System.out.println("count="+count);
	}
	public int vowelCount(String s)	
	{
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		 if (s.charAt(i)=='a' ||s.charAt(i)=='e'|| s.charAt(i) == 'i'|| s.charAt(i) == 'o'|| s.charAt(i) == 'u') 
         {
             count++;
         }
	}
		
	return count;	
	
		
	}

}
