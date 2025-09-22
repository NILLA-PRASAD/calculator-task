package task.com;

import java.util.Scanner;

public class Calculator_Task1 {
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  boolean running=true;
		  double result=0,num1=0;
		  int count=1;
		  while(running) {
			  if(count!=0) {
				  System.out.println("Enter a number");
				   num1=sc.nextInt();
			  }
	          menu();
	          int choice=sc.nextInt();
	          
	          if(choice==6) {
	        	  running=false;
	        	  System.out.println("Exiting Calculator. Goodbye...!");
	        	  break;
	          }
	          double num2=0;
	          if(choice!=5) {
	        	  System.out.println("Enter a number");
	               num2=sc.nextDouble();
	          }
			  switch(choice) {
			  case 1:
				    result=add(num1,num2);
				    num1=result;
				    break;
			  case 2:
				   result=sub(num1, num2);
				   num1=result;
				   break;
			  case 3:
				  result=multiplication(num1, num2);
				  num1=result;
				  break;
			  case 4:
				    result=division(num1, num2);
				    num1=result;
			  case 5:
				  System.out.println("Result is: "+result);
				  running=false;
				  break;
			  }
			  count=0;
		  }
	}
	  public static double add(double a, double b) {
		  return a+b;
	  }
	  public static double sub(double a, double b) {
		  return a-b;
	  }
	  public static double multiplication(double a, double b) {
		  return a*b;
	  }
	  public static double division(double a, double b) {
		  if(b==0) {
			  System.out.println("Error: Cannot divide by zero!");
			  return 0;
		  }
		  return a/b;
	  }
	  
	  public static void menu() {
		  System.out.println("\n---Calculator Menu---\n");
		  System.out.println("1.  Addition");
		  System.out.println("2.  Subtraction");
		  System.out.println("3.  Multiplication");
		  System.out.println("4.  Division");
		  System.out.println("5.  Result");
		  System.out.println("6.  Exit");
		  System.out.println("Choose an option: ");
	  }
	}



