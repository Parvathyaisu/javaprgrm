package oopspkg;

import java.util.Scanner;

interface Bank
 {
	public void accountdetails(String name);
	void balancemthd();
	Void withdraw();
	void deposit();
 }
  class Sbi implements Bank
   {
    static String bankname="Sbi";
    int balance=40000;
    int deposit;
    int withdraw;
    int accountno;
    Scanner sc=new Scanner(System.in);

@Override
 public void accountdetails(String name) 
   {
	System.out.println("Enter your account no:");
	accountno=sc.nextInt();
	System.out.println("Your name:"+name+"\n"+"Your account number:"+accountno+"\n"+"Your bank name:"+bankname);
    }

@Override
public void balancemthd() 
    {
	 System.out.println("Balance is:"+balance);
	
    }

@Override
 public Void withdraw() 
    {
	       System.out.println("Enter your withdrawal amount:");
	       withdraw=sc.nextInt();
	       balance=balance-withdraw;
	       System.out.println("Your final balance:"+balance);
		return null;
	 }

@Override
 public void deposit() 
    {
	    System.out.println("Enter your deposit amount:");
	    deposit=sc.nextInt();
	    balance=balance+deposit;
	    System.out.println("Your final balance is :"+balance);
	
	}



}


public class BankAppliPGM {

	public static void main(String[] args) {
	
            Sbi sb=new Sbi();
            sb.accountdetails("Parvathy");
            sb.balancemthd();
            sb.withdraw();
            sb.deposit();
	}

}
