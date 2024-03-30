package practiceqns;

import java.util.Scanner;

public class Calculatorprgm {

	public static void main(String[] args) {
		//calculator program
//1		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		char operator=sc.next().charAt(0);
		switch(operator)
		{
		case'a':System.out.println("sum="+(a+b));
		break;
		case'b':System.out.println("sub="+(a-b));
		break;
		case'c':System.out.println("mul="+(a*b));
		break;
		case'd':System.out.println("divi="+(a/b));
		break;
		default:System.out.println("operator is error");
		
		}
		
		
//2		
		System.out.println("Enter two numbers:");
		double first = sc.nextDouble();
		double second = sc.nextDouble();
		System.out.print("Enter an operator (+, -, *, /): ");
		char operator1 = sc.next().charAt(0);
		double result;
		
		switch(operator1)
		{
		case '+':
		result = first + second;
		break;
		case '-':
		result = first - second;
		break;
		case '*':
		result = first * second;
		break;
		case '/':
		result = first / second;
		break;
		
		default:
		System.out.printf("Error! operator is not correct");
		return;
		}
		
		System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
	}

	private Scanner sc;

//3
	 
/*	System.out.println("Enter two number:");
	  int firstno = sc.nextInt();
     int secondno = sc.nextInt();
	 
	  System.out.print("Enter an operator (+, -, *, /): ");
	  String operation2 = sc.next();
     int result = performOperation(firstno, secondno, operation2);
     System.out.println("Your answer is: " + result);
  public static int performOperation(int firstNumber, int secondNumber, String operation2)
 {
      int result = 0;
      if (operation2.equals("+")) {
         result = firstNumber + secondNumber;
    }
      else if (operation2.equals("-")) {
          result = firstNumber - secondNumber;
      }
      else if (operation2.equals("*")) {
          result = firstNumber * secondNumber;
      }
      else if (operation2.equals("%")) {
          result = firstNumber % secondNumber;
      }
      else if (operation2.equals("/")) {
          result = firstNumber / secondNumber;
      }
      else {
          System.out.println("Invalid operation");
      }
      return result;
  }*/
		
	

}
