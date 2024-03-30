package pkg;

public class Operators {

	public static void main(String[] args) {
		
		//Arithmetic operators(+,-,*,/,%)
		
		int a=25,b=12;
		
		System.out.println("a+b="+(a+b));  //37
		System.out.println("a-b="+(a-b));  //13
		System.out.println("a*b="+(a*b));  //300
		System.out.println("a/b="+(a/b));  //--quotient  2
		System.out.println("a%b="+(a%b));  //--reminder  1
		
         //Assignment Operators(=,+=,-=)
		
		int c=a;
		System.out.println(a+=b); //a=a+b  37
		System.out.println(a-=b); //a=a-b  25
		
		
		//Relational Operators(<,>,<=,>=,!=,==)
		
		System.out.println(a==b); //false
		System.out.println(a!=b); //true
		System.out.println(a<b);  //false
		System.out.println(a>b);  //true
		System.out.println(a<=b); //false
		System.out.println(a>=b); //true

		//Logical operators(&&,||,!)
		
	//    A        B        A&&B      A||B     !A     !B
	//	  0        0         0         0        1      1
	//	  1        0         0         1        0      1
	//    0        1         0         1        1      0
	//    1        1         1         1        0      0
	
		
		String username="abd";
		String pswd="abd132";
		System.out.println(username=="abd" && pswd=="abd132"); //true
		System.out.println(username=="abd" || pswd=="abd132"); //true
		System.out.println(!(username=="abd"));   //false
		
		//unary operators(++,--)
		
		int c1=10,c2=5;
		
		//c1++ - postincrement
		//++c1 - preincrement
		
		System.out.println(c1++); //10
		System.out.println(c1);   //11
		System.out.println(++c1); //12
		System.out.println(c1--); //12
		System.out.println(c1);   //11
		System.out.println(--c1); //10
		
		
		//ternary operator
		//syntax    variable= condition?exp1:exp2
		
		String v=c1>c2?"c1 is greater":"c2 is greater";
		System.out.println(v); // c1 is greater
		
		
	}

}
