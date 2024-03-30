package practiceqns;

public class PermutationAndCombination {

	static int factorial (int n) 
	{
		int fact=1,i=1;
		while(i<=n)
		{
		fact=fact*i;
		i++;
		}
		return fact;
	}
	
public static void main(String[] args) 
 {
	int n=3,r=2,permu,comb;	
	permu=factorial(n)/factorial(n-r);
	System.out.println("permutation is:"+permu);	
	comb=factorial(n)/factorial(r)*factorial(n-r);	
	System.out.println("permutation is:"+comb);	
 }
   



 


}
