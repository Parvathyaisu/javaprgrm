package oopspkg;
class Member
{
String Name;
int Age,Phoneno,Salary;
String Address;


public void printDetails()
{
	System.out.println("Name is"+Name+"Age is"+Age+"Phoneno is"+Phoneno+"Salary is"+Salary+"Address is"+Address);
}

class Empee extends Member
{
	String dep;
}

class Manager extends Member
{
	String spec;	
}


public class Membersinheritancepgm {

	public static void main(String[] args) {
		

 
 //Manager m1=new Manager();
// m1.Name="Aiswarya";
// m1.Age=23;
// m1.Phoneno=98874732;
// m1.Salary=40000;
// m1.Address="Raas Adoor";
// m1.printDetails();
// System.out.println(m1.spec);
 		 
	}
}
}

