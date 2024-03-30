package pkg;

public class question {

	public static void main(String[] args) {
		
		//Swapping
		
		int a=14,b=20,d;
		
		System.out.println("Before swaping value of a="+a +"\n"+"value of b="+b);//a=14,b=20
		
		d=a;
		a=b;
		b=d;
		System.out.println("after swaping value of a="+a +"\n"+"value of b="+b);//a=20,b=14
		
		//without variables swapping
		
		int c=14,f=20;
		System.out.println("Before swaping value of c="+c +"\n"+"value of f="+f);
		
		c=c+f;
		f=c-f;
		c=c-f;
		System.out.println("after swaping value of c="+c +"\n"+"value of f="+f);
		
		
		
		//questions
		
		int a1=23,b1=45;
		System.out.println(a1==b1); //false
		
		int a2=55,b2=70;
		System.out.println(a2<50&&a2<b2); 
		
		
		int r=20,n=30;
		System.out.println("Before swaping value of r="+r +"\n"+"value of n="+n); //r=20,n=30
		
		r=r+n;
		n=r-n;
		r=r-n;
		System.out.println("after swaping value of r="+r +"\n"+"value of n="+n); //r=30,n=20
		
		int a3=17;
		System.out.println("a3%10="+(a3%10)); //7
	}

}
