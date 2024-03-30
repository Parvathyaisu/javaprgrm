package arraypgms;

import java.util.Scanner;

public class Vowelcharacter {

	public static void main(String[] args) {
	   
		//the character is vowel or consonant
		
		System.out.println("Enter a name");
		Scanner sc=new Scanner(System.in);
		String ab=sc.next();
		
       if(ab.charAt(0)== 'a' || ab.charAt(0) == 'e' || ab.charAt(0)== 'i' || ab.charAt(0) == 'o' ||ab.charAt(0)== 'u' )
         {
         System.out.println("the character is vowel");
         }
       else 
         {
         System.out.println("the character is consonant");
         }
	}
        
	
}

