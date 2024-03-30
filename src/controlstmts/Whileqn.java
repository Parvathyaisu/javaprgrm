package controlstmts;

public class Whileqn {

	public static void main(String[] args) {
		
		//number reverse
		
		int n=567;
		int rem;
		int rev=0;
		
		while(n>0)
		{
			rem=n%10;  //567%10=7 , //56%10=6 ,//5%10=5
			rev=rev*10+rem;  //0*10+7=7 , //7*10+6=76 ,//76*10+5=765
			n=n/10; //567/10=56 , //56/10=5 , //5/10=0
		}	
			System.out.println(rev);
			
		

	}

}
