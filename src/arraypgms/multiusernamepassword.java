package arraypgms;

import java.util.Scanner;

public class multiusernamepassword {

	public static void main(String[] args) {
		
		String[][] ar=new String[4][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username and password");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<2;j++)
			{
			ar[i][j]=sc.next();
		    }
		}
		System.out.println("Entered username and password");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(ar[i][j]+" ");
		    }
			System.out.println();
		}
	}

}
