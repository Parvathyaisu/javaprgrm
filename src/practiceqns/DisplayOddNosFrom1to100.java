package practiceqns;

public class DisplayOddNosFrom1to100 {

	public static void main(String[] args) {
		
        int n=100;
		System.out.println("list of odd numbers from 1 to "+n+" numbers : ");
		for(int i=0;i<=n;i++)
		 {
			if(i%2!=0)
			 {
				System.out.print(i+" ");
			 }
		 }
	}

}
