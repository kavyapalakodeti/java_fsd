package practiseprograms;

import java.util.Scanner;

public class Throw {
	public static void main(String args[]) {
		Scanner o=new Scanner(System.in);
		System.out.println("Enter a,b values");
		int a=o.nextInt();
		int b=o.nextInt();
		try {
			if(a==b)
			{
				throw new Exception();
			}
			else{
				System.out.println("Value of a is "+a);
				System.out.println("Value of b is "+b);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception found!!!");
		}
	}
}
