package arraypgms;

import java.util.Scanner;

public class Methodpgm {

	public static void main(String[] args) {
		
	Methodpgm ob=new Methodpgm();
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers");
	int v1=sc.nextInt();
	int v2=sc.nextInt();
	ob.add();
	int subanswer=ob.sub();
	System.out.println(subanswer);
	ob.mul(v1,v2);
	System.out.println(ob.div(v1,v2));
	}
	
	//method without returntype and without parameter
	
	public void add()
	{
		int a=20,b=10,c;
		c=a+b;
		System.out.println(c); //30
	}
	
	//method with returntype and without paramneter
	
	public int sub()
	{
	int a=40,b=10,c;
	c=a-b; //30
	return c;
	}
	
	//method without returntype and with parameter
	
	public void mul(int a,int b)
	{
	int c=a*b;
	System.out.println(c);//40*30=1200
	}
	
	//method with returntype and with parameter
	
	public double div(int a,int b)
	{
	double c=a/b; //1.0
	return c;
	}

		
	



}
