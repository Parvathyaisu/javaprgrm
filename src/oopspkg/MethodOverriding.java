package oopspkg;

class Parent1
{
	public void job()
	{
		System.out.println("Engineer");
	}
}

class Child extends Parent1
{
 @Override
	public void job() 
{
		  System.out.println("Doctor");
		  super.job();
	}

 }

public class MethodOverriding {

	public static void main(String[] args) {
		
		Child ch=new Child();
        ch.job();
	}

}
