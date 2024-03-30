package oopspkg;

class Parent
{
	public void display()
	{
		System.out.println("display method");
	}
}

class Son extends Parent
{
	public void sonmthd()
	{
		System.out.println("child details");
	}
}


public class Singlelevelinheritance {

	public static void main(String[] args) {
		Son k=new Son();
		k.display();
		k.sonmthd();
	}

}
