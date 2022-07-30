package practiseprograms;


public class Finally {
	public static void main(String args[]) {
		
		try {
			int a=10/0;
			System.out.println("Result\t "+a);
			System.out.println("No Exception");
		}
		catch(Exception e)
		{
			System.out.println("Catch Block");
		}
		finally {
			System.out.println("Finally block");
		}
		
	}
}
