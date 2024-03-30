package arraypgms;

import java.util.Scanner;

public class LargestElementinanArray {

	public static void main(String[] args) {
		
		//largest element in an array
	  
		 int [] aa = new int[] {2,4,7,4,9,1};
		 Scanner sc=new Scanner(System.in);
		 int lar = aa[0];
		 for (int i = 0; i < aa.length; i++)
	     {  
	          if(aa[i]>lar)  
	          {
	        	  lar = aa[i];  
	        } 
	          
	     }
	     System.out.println("Largest element present in the array:"+lar);   

	}

}
