package uncheckedException;
/*
 * NullPointerException : If we have a null value in any variable, performing any operation on the variable throws a NullPointerException.
 * */
//public class NullPointerException {
//	public static void main(String[] args) {
//		String s=null;  
//		System.out.println(s.length());//NullPointerException  	
//	}
//}

//Java program to demonstrate NullPointerException
class NullPointerException extends Exception
{
	public static void main(String args[]) throws NullPointerException
	{
		String a = null; //null value
		System.out.println(a.charAt(0));
	}
}
