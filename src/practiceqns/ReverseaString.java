package practiceqns;

public class ReverseaString {

	public static void main(String[] args) {
	
		String name="parvathy";
		String reverse="";
		System.out.println("string is:"+name);
		for(int i=0;i<name.length();i++)
		{
			reverse=name.charAt(i)+reverse;
		}
		System.out.println("reverse of a string is:"+reverse);
		
		
		
		
		
	}

}
