package practiceqns;

public class questions {
	 public static void main(String[] args) {
//1	left	  
		 int rows = 6; // Input number of rows
		  
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                //System.out.print("* ");
	            	System.out.print(j+" ");
	            }
	            System.out.println();
	        }
//2	right
      int row = 5;
	 for (int i = 1; i <= row ; i++) {
	 for (int j = 1; j <= row - i; j++) {
	 System.out.print(" ");
	 }
	 for (int k = 1; k <= i; k++) {
	 System.out.print("*");
	 }
	 System.out.println("");
	 }

//inverted left
	 int rowz = 5;

	    for (int i = rowz; i >= 1; --i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print("* ");
	      }
	      System.out.println();
	    }	

	  
	    
	  
	 } 
}