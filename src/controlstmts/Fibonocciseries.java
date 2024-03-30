package controlstmts;

public class Fibonocciseries {

	public static void main(String[] args) {
		
		// fibonacci series
		
		int a=0,b=1,n=10;
		System.out.println("Fibonacci Series of " + n + " terms:");
		for(int i=1;i<=n;++i)
		{
			System.out.println(a + ", ");
			int c=a+b;
			  a=b;
			  b=c;
			
		}
	}

}




  
  