package uncheckedException;
/*
 * try    : The "try" keyword is used to specify a block where we should place an exception code. It means we can't use try block alone. The try block must be followed by either catch or finally.
 * catch  : The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.
 * finally: The "finally" block is used to execute the necessary code of the program. It is executed whether an exception is handled or not.
 *
 *	ArithmeticException
 *-----------------------
 * If we divide any number by zero, there occurs an ArithmeticException.
*/

public class ArithmaticException {
	 public static void main(String args[]){  
		 System.out.println("Main Start...");
		 try{
			 System.out.println("Try block start...");
			 System.out.println("'10/0' this code raise exception");
			 int data=10/0;  
			 System.out.println("Try block end...");
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println("Catch block Handle Exception...");
			 System.out.println(e);
			 System.out.println("Catch block end...");
			 
		 }  
		   	 //rest code of the program   
		 System.out.println("Main End...");
		 }  
}
