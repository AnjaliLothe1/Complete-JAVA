package uncheckedException;
/*	ArrayIndexOutOfBoundsException
 * ----------------------------------
 * When an array exceeds to it's size, the ArrayIndexOutOfBoundsException occurs. 
 * there may be other reasons to occur ArrayIndexOutOfBoundsException.
 * 
 * */
public class ArrayIndexOutOfBoundsException {
public static void main(String[] args) {
	int a[]=new int[5];  
	a[100]=50; //ArrayIndexOutOfBoundsException  
}
}
