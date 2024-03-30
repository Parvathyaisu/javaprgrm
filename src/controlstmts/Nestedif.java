package controlstmts;

public class Nestedif {

	public static void main(String[] args) {
		 
		int a=55;
		if(a%5==0)
		{
		
		 if(a%11==0)
		 {
			 System.out.println("divisible by 11 and 5");
		 }
		 else
		 {
			 System.out.println(" divisible by 5 and not divisible by 11 "); 
		 }
		}
		 else
		 {
			 System.out.println("not divisible by 5 and 11");  
		 }
		
	}

}
