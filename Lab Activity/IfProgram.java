2. Write a Java Program to print greatest of three numbers 
using if else


package java2;



public class IfProgram{

	  public static void main(String[] args) {

	      int num1 = 10, num2 = 60, num3 = 95;

	      if( num1 >= num2 && num1 >= num3)
           {
	          System.out.println(num1+" is the largest Number");

           }
	      else if (num2 >= num1 && num2 >= num3)
            {
	          System.out.println(num2+" is the largest Number");
            }

	      else
             {
	          System.out.println(num3+" is the largest Number");
            }
	  }
	}
