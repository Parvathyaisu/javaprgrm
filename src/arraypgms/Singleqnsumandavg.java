package arraypgms;

import java.util.Scanner;

public class Singleqnsumandavg {

	public static void main(String[] args) {
		
		int[] ar=new int[4];
		System.out.println("Enter numbers");
		Scanner sc=new Scanner(System.in);
		int sum=0,avg=0;
		for(int i=0;i<=3;i++)
		{
			ar[i]=sc.nextInt();
	     sum =sum+ ar[i];
		avg=sum/4;
		}
		System.out.println("sum is="+sum);
		System.out.println("average="+sum/4);
	}

}
