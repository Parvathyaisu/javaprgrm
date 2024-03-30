package oopspkg;

class Birds
{
	public void birdmthd()
	{
		System.out.println("Bird details");
	}

	
		
	}




class Puppy extends Birds
{
	public void puppymthd() 
	{
		System.out.println("puppy details");
	}
}

class Fish extends Birds
{
	public void fishmthd()
	{
		System.out.println("Fish details");
	}
}



public class Hierarchialinheritance {

	public static void main(String[] args) {
	
	Puppy b=new Puppy();	
    b.birdmthd();
    b.puppymthd();
    Fish f=new Fish();
    f.birdmthd();
    f.fishmthd();
    
	}

}
