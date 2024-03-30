package arraypgms;

public class CountofCharacterofanArray {

	public static void main(String[] args) {
		 //count of characters of an array
		    String name= "parvathy r unnithan";    
	        int count=0;    
	        for(int i=0;i < name.length();i++)
	          {    
	            if(name.charAt(i)!=' ')    
	                count++;    
	          }    
	     
	        System.out.println("Total number of characters in a string: " + count); 
	}

}
