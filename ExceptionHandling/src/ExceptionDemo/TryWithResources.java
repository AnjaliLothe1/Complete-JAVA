package ExceptionDemo;


// Read values from ResourecsFile and divide the number one by one. get the output.
import java.io.*;
import java.util.*;

public class TryWithResources {

    
    static void Divide() throws Exception
    {
        
        
        try(FileInputStream fi=new FileInputStream("C:\\Users\\intel\\eclipse-workspace\\Core_Java\\ExceptionHandling\\src\\ExceptionDemo\\ResourcesFile.txt");Scanner sc=new Scanner(fi) )
        {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(a/c);
        }
        
    }
    
    public static void main(String[] args) throws Exception
    {
        try
        {
        Divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        //int x=sc.nextInt();
        
       // System.out.println(x);
        
    }
    
}
/*
1. All the things that are	outside	the	program	are	resource to	a program.	
2. Heap	is also a resource	to a program.	
3. Whenever	a program needs	a resource it Should acquire it	and	when do	not	need We	should return it.	
4. To write	an	object	in	heap we	write new.	
5. In java heap	memory objects are deallocated automatically by	garbage	collector.	
6. Finally keyword is used	in	association	with a try/catch block.	
7. Finally	keyword	is	meant to execute whether an exception occurs or not.	
8. Resources are needed	to be closed in	finally	block.
9. The try-with-resources statement is a try statement that	declares one or	more resources.		
10. The	try-with-resources	statement ensures that each	resource is closed	at	the	end	of the statement




*/