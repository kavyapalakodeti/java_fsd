package encapsulation;

interface FirstInterface 
{  
    default void show() 
    { 
        System.out.println("Default First Interface"); 
    } 
} 
interface SecondInterface 
{  
    default void show() 
    { 
        System.out.println("Default Second Interface"); 
    } 
}  
public class DiamondProblem implements FirstInterface, SecondInterface{
	public void show() 
    {  
        FirstInterface.super.show(); 
        SecondInterface.super.show(); 
    } 
    public static void main(String args[]) 
    { 
    	DiamondProblem ob = new DiamondProblem(); 
        ob.show(); 
    } 
}
