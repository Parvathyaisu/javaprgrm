package oopspkg;

//abstract method
abstract class Car
{
	abstract public void acceleration();
	abstract public void speedlimit();
//regular method
public void carengine()
{
	System.out.println("carengine");
}

}

class kia extends Car
{

	@Override
	public void acceleration() {
		System.out.println("kia acceleration");
		
	}

	@Override
	public void speedlimit() {
		System.out.println("kia speedlimit");	
		
	}
	
}

class Maruti extends Car
{

	@Override
	public void acceleration() {
		System.out.println("Maruti acceleration");
		}

	@Override
	public void speedlimit() {
		System.out.println("Maruti speedlimit");
		
	}
	
}


public class Abstractionpgm {

	public static void main(String[] args) {
		
      kia k=new kia();
      k.acceleration();
      k.carengine();
      k.speedlimit();
      Maruti m=new Maruti();
      m.acceleration();
      m.carengine();
      m.speedlimit();
	}

}
