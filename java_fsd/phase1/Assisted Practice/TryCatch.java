package practiseprograms;

import java.util.Scanner;

public class TryCatch {
	
	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		
		System.out.println("enter 2 nums");
		int num1=t.nextInt();
		int num2=t.nextInt();
		
		int num3;
		// TODO Auto-generated method stub
		try{
			num3=num1/num2;
			System.out.println("value of num3 is "+num3);
		}
		catch(ArithmeticException e){
			System.out.println("Cannot divide a number by 0");
			System.out.println(e.getMessage());
		}
		catch(Exception d){
			System.out.println("Exception found!!!");
		}
		finally{
			num3=num1+num2;
			System.out.println("Addition of 2 numbers is"+num3);
		}
	}

}
