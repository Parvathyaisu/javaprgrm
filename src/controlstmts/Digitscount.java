package controlstmts;

public class Digitscount {

	public static void main(String[] args) {
		//While loop -no of digits
		

		int n=5678;
		
		int count=0;
	  while(n>0)
		{
		 n=n/10; //5678/10=567 //567/10=56 //5/10=0
			
			count++; //1 //2 //3 //4
		}
	  System.out.println(count);	
		
	}

}
