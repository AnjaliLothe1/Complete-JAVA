package uncheckedException;
/* NumberFormatException
 * -------------------------
 * If the formatting of any variable or number is mismatched, it may result into NumberFormatException. 
 * Suppose we have a string variable that has characters; 
 * converting this variable into digit will cause NumberFormatException.
 * */
public class NumberFormatException {
public static void main(String[] args) {
	String s="Anjali";  
	int i=Integer.parseInt(s);//NumberFormatException
}
}
