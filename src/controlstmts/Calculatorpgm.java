package controlstmts;

import java.util.Scanner;

public class Calculatorpgm {

	public static void main(String[] args) {
	
	char a;
	int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose an operator:+,-,*,or /");
		a=sc.next().charAt(0);
		System.out.println("Enter first number");
		n=sc.nextInt();
		System.out.println("Enter second number");
		i=sc.nextInt();
	    
	switch(a)
	{
	case '+':System.out.println(i+"+"+n+"="+(i+n));
	break;
	case '-':System.out.println(i+"-"+n+"="+(i-n));
	break;
	case '*':System.out.println(i+"*"+n+"="+(i*n));
	break;
	case '/':System.out.println(i+"/"+n+"="+(i/n));
	break;
	default:System.out.println("invalid input");
	}
		}
     }









