package oopspkg;

		class Animal3
		{
			public void animalmthd()
			{
				System.out.println("animal details");
			}

		}
		class Dog extends Animal3
		{
			public void dogmthd()
			{
				System.out.println("dog details");
			}
		}
		class BabyDog extends Dog
		{
			public void babydogmthd()
			{
				System.out.println("baby dog details");
			}
		}



		public class Multilevelinheritance {
			
			public static void main(String[] args) {
			
			BabyDog a=new BabyDog();	
		    a.animalmthd();
		    a.dogmthd();
		    a.babydogmthd();
			}

	

}
