package arraypgms;

import java.util.Scanner;

public class NeitherIncreOrDecre {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
	        if (x<y && y<z)
	          {
	            System.out.println("Increasing order");
	          }
	        else if (x>y && y>z)
	          {
	            System.out.println("Decreasing order");
	          }
	        else
	          {
	            System.out.println("Neither increasing or decreasing order");
	          }
		
		
		
		
	}

}
