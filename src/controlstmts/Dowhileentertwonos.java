package controlstmts;

import java.util.Scanner;

public class Dowhileentertwonos {

	public static void main(String[] args) {
		//enter two numbers
		
		Scanner sc=new Scanner(System.in);
		int a,b,sum;
		char c;
		do
		{
			System.out.println("Enter two numbers");
			a=sc.nextInt();
			b=sc.nextInt();
			sum=a+b;
			System.out.println("Sum is " + sum);
			System.out.println("Do you wish to perform this operation again,y/n?");
			c=sc.next().charAt(0);
			}
		while(c=='y' ||c!='n');
		System.out.println("Sum" + sum);
		
	}

}


     