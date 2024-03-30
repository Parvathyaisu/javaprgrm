package oopspkg;

public class MethodOverloading {

	public static void main(String[] args) {
	
		MethodOverloading mo=new MethodOverloading();	
		mo.add();
		mo.add(3, 5);
		mo.add(3.5, 2);
		mo.add(4, 2.5);

	}
	
	public void add()
	{
		int a=20,b=10,c;
		c=a+b;
		System.out.println(c);
	}
	
	public void add(int a,int b)
	{
	   int c=a+b;
	   System.out.println(c); 
	}
	
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	
	
	
	
}
