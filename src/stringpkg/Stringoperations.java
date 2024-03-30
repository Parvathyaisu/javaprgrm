package stringpkg;

public class Stringoperations {

	public static void main(String[] args) {
	
		//concate
		
		String s="hello";
		String s1="welcome";
		String s3="Hello welcome";
		System.out.println(s+s1);//hellowelcome
		System.out.println(2+3+s+5+6);//5hello56
		
	//equals
		
		System.out.println(s.equals(s1));//false
		System.out.println(s.equalsIgnoreCase(s3));//false
		
	//contains
		
		System.out.println(s3.contains("welcome"));//true
		
	//touppercase and tolowercase
		
		System.out.println(s.toUpperCase());//HELLO
		System.out.println(s.toLowerCase());//hello
		
	//length
		
		System.out.println(s.length());//5
		
	//startswith and endswith 
		
		System.out.println(s3.startsWith("hello"));//false
		System.out.println(s3.endsWith("welcome"));//true
		
	//trim
		
		System.out.println(s1.trim());//welcome 
		
	//replace
		
		System.out.println(s3.replace("Hello", "hi"));
		
	//substring
		
		System.out.println(s.substring(1,3));
		
	//split
		
		String s4="hello welcome to luminar technolab";
	    String[] st=s4.split(" ");
		for(String e:st)
		{
		System.out.println(e);
		}
	
		//tochararray
		
		String s5="hello";
		char[]c=s5.toCharArray();
		for(char ele:c)
		{
		System.out.println(ele);
		}
	
	
	}

}
