package practiceqns;

public class Palindrome {

	public static void main(String[] args) {
		
//1
	 int r,sum=0,temp;
	 int n=454;
	 temp=n;
	while(n>0) 
	{
	 r=n%10;
	 sum=(sum*10)+r;
	 n=n/10;
	}
	if(temp==sum)	
	{
	 System.out.println("palindrome");	
	}
	else
	{
	 System.out.println("not palindrome");	
	}
		
		
//2
	String first="Radar",reverse="";
	int name=first.length();	
	for(int i=(name-1);i>=0;--i)
	{
	reverse=reverse+first.charAt(i);	
	}
	if(first.toLowerCase().equals(reverse.toLowerCase()))
	{
		System.out.println(first+ " is a Palindrome String.");
	}
	else {
	      System.out.println(first + " is not a Palindrome String.");
	    }
	
	
	
	}

}
