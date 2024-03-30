package stringpkg;

public class CountString {

	public static void main(String[] args) {

//count all words in a string
		
		String k = "parvathy r unnithan";
        k =k.trim();
        String[] words=k.split("\\s+");
	    int Count=words.length;
	    System.out.println("Number of words in a string: " + Count);
	    }
	
	
}
