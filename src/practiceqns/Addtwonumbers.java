package practiceqns;

import java.util.Scanner;

public class Addtwonumbers {

	public static void main(String[] args) {
		 //Addition of two numbers 
		
	//1	    
		    int a=30,b=10,sum;
		    sum=a+b;
		    System.out.println("sum="+sum);
	

		
	//2  
	
    
          System.out.println("Enter two numbers");
	      Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      int o=sc.nextInt();
	      int sum1=n+o;
	      System.out.println("sum="+sum1);
	      
		    
	
	//3	
   
		Scanner s=new Scanner(System.in);
	    int m,k,sum2;
	    char c;
	    do
	    {
	    	 System.out.println("Enter two numbers");
	    	 m=s.nextInt();
	    	 k=s.nextInt();
	    	 sum2=m+k;
	    	 System.out.println("sum="+sum2);
	    	 System.out.println("Do you wish to perform this operation again,y/n?");
	    	 c=sc.next().charAt(0);
	    }
	while(c=='y'||c!='n');
	System.out.println("sum="+sum2);
      

//4
	
	int[]ar=new int[4];
	System.out.println("Enter numbers");
	Scanner sk=new Scanner(System.in);
	int sum3=0;
	for(int i=0;i<=3;i++)
	{
	ar[i]=sc.nextInt();
	sum3=sum3+ar[i];
      }
	System.out.println("sum="+sum3);
}
}


