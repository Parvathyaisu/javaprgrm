package practiceqns;

import java.util.Scanner;

public class SmallAndLargestNoFromThreeNos {

	public static void main(String[] args) {

//smallest
		
   int a,b,c,smallestno,temp;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter three numbers :");
   a=sc.nextInt();	
   b=sc.nextInt();		
   c=sc.nextInt();		
   temp=a<b?a:b;
   smallestno=c<temp?c:temp;
   System.out.println("The smallest number is : "+smallestno);

//largest
   
   int largest,lar;
   lar=a>b?a:b;
   largest=c>lar?c:lar;
   System.out.println("The largest no is :"+largest);
   
   
   
   
   
		
	}

}
