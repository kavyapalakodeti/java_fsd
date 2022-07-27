
package practiseproject;
import java.util.Scanner;
public class Calculator {
	char n;
	int a,b;
	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);

		
		while(true){
		System.out.println("+-->Addition  \n- -->Subraction \n*--> Multiplication\n/--> Division\n.--> Exit");
		char n = o.next().charAt(0);
		
		switch(n){
		case '+':	System.out.println("Enter 2 numbers");
					int a=o.nextInt();
					int b=o.nextInt();
					System.out.println("Addition of 2 numbers is "+(a+b));
					break;
		case '-':	System.out.println("Enter 2 numbers");
					int c=o.nextInt();
					int d=o.nextInt();
					System.out.println("Subraction of 2 numbers is "+(c-d));
					break;
		case '*':	System.out.println("Enter 2 numbers");
					int e=o.nextInt();
					int f=o.nextInt();System.out.println("Multiplication of 2 numbers is "+(e*f));
					break;
		case '/':	System.out.println("Enter 2 numbers");
					float g=o.nextFloat();
					float h=o.nextFloat();
					System.out.println("Division of 2 numbers is "+(g/h));
					break;
		case'.':	System.exit(0);	
		default: 	System.out.println("Enter correct choice");
					break;
		}
		}
	}

}
