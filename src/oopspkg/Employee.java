package oopspkg;

public class Employee {

	int empid;
	String empname;
	
	public Employee(int empid,String empname) 
	{
	    this.empid=empid;
		this.empname=empname;
	}
     public void display()
      {
	    System.out.println("empid="+empid);
	    System.out.println("empname="+empname);
      }
     public static void main(String[] args) 
      {
	  Employee emp=new Employee(101,"Aryan");
	 emp.display();
	 Employee emp2=new Employee(102,"Akhil");
	 emp2.display();
	 

	 
	 
      }
}