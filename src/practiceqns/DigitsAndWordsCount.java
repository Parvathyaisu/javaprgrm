package practiceqns;

public class DigitsAndWordsCount {

	public static void main(String[] args) {

//digits count 
		int n=98345,count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);
		
//words count		
		String name="my name is parvathy";
		int namecount=name.split("\\s").length;
		System.out.println(namecount);
		
	}

}
