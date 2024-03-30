package oopspkg;

interface Cardetails
{
	public void acceleration();
	void speedlimit();
}

class Ford implements Cardetails
{

	@Override
	public void acceleration() 
	 {
	    System.out.println("Ford acceleration");
	 }

	@Override
	public void speedlimit()
	 {
		System.out.println("Ford speed limit");	
	 }
	
}


public class InterfacePgm {

	public static void main(String[] args) {
		Ford ob=new Ford();
		ob.acceleration();
		ob.speedlimit();

	}

}
