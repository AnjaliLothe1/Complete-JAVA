package ExceptionDemo;


public class FinallyDemo 
{
    static void GreetMsg()throws Exception
    {
        try
        {
            
        throw new Exception();
        }
        finally
        {
           //this message willdefinitly execute 
        System.out.println("Have a Great Day...");
        }
        
    }
    
    public static void main(String[] args) throws Exception
    {
    	GreetMsg();
    }   
}