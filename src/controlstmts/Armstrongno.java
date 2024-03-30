package controlstmts;

public class Armstrongno {

	public static void main(String[] args) {
		 //Armstrong number
		//153=1^3+5^3+3^3=153
		
		int n=153;
		int temp=n;
		int r,s=0;  //sum=0,reminder r
		
		while(n>0)
		{
			r=n%10;  //3
			s=s+r*r*r; //0+3*3*3=27
			n=n/10; //15 
		}	
		if(temp==s)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}

	}

}
