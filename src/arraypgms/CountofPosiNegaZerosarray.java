package arraypgms;

import java.util.Scanner;

public class CountofPosiNegaZerosarray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int countP=0, countN=0, countZ=0;
		int[] ar=new int[10];
		System.out.println("Enter ten numbers");
		
		for(int i=0;i<10;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		for(int i=0;i<10;i++)
		{
			if(ar[i]<0)
	            countN++;
	         else if(ar[i]>0)
	            countP++;
	         else
	            countZ++;
	      }
		
		 System.out.println("Total Positive Number=" +countP);
	     System.out.println("Total Negative Number=" +countN);
	     System.out.println("Total Zero=" +countZ);
	}

}
