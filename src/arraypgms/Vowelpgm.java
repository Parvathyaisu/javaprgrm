package arraypgms;

import java.util.Scanner;

public class Vowelpgm {

	public static void main(String[] args) {
		
		String an="Values";
		Scanner sc=new Scanner(System.in);
		an=an.toLowerCase();
        int count = 0;
 
        for(int i=0;i<an.length();i++) 
        {
            
            if (an.charAt(i)=='a' ||an.charAt(i)=='e'|| an.charAt(i) == 'i'|| an.charAt(i) == 'o'|| an.charAt(i) == 'u') 
            {
                count++;
            }
        }
 System.out.println("Total no of vowels in string are: " + count);
	}

}
