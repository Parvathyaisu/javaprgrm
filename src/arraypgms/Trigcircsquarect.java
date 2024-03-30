package arraypgms;

import java.util.Scanner;

public class Trigcircsquarect {

	public static void main(String[] args) {
		
		Trigcircsquarect ob=new Trigcircsquarect();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int b=sc.nextInt();
		int h=sc.nextInt();
		ob.mul(b,h);
		System.out.println("area of triangle is"+(b*h)/2);
		ob.multi(4);
		int arr=ob.arr();
		System.out.println("area of rectangle is"+arr);
		ob.mnn();
	}
		public double mul(int b,int h)
		{
		double m=((b*h)/2);
		return m;
		}
		
		public void multi(int a)
		{
			int c=a*a;
			System.out.println("area of square is"+c);
		}
		
		public int arr()
		{
			int l=4,b=5,c;
			c=l*b;
			return c;
		}
		public void mnn()
		{
		int r=8;
		double e=3.14;
		double c= e*r*r;
		System.out.println("area of circle is"+c);
		}
}
