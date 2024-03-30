package oopspkg;

interface Tvremote
{
	public void channeldown();
	void channelup();
}
interface Smarttvremote
{
	public void bluetooth();
	void youtube();
}

class Tv implements Tvremote
{

	@Override
	public void channeldown() {
		System.out.println("tv channeldown");
		
	}

	@Override
	public void channelup() {
		System.out.println("tv channelup");
	}

}

class Tv1 implements Smarttvremote
{

	@Override
	public void bluetooth() {
	
		System.out.println("tv bluetooth");
	}

	@Override
	public void youtube() {
		System.out.println("tv youtube");
		
	}
	
}

public class InterFacepgm2 {

	public static void main(String[] args) {
		Tv t=new Tv();
		t.channeldown();
		t.channelup();
		Tv1 t1=new Tv1();
		t1.bluetooth();
		t1.youtube();
	}

}
