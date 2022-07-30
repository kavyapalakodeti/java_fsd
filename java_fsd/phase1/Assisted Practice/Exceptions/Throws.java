package practiseprograms;

import java.io.IOException;
import java.util.Scanner;

public class Throws {
	
static int display(int l, int b) throws IOException{

	if(l>b){
		throw new IOException("length is greater than breadth, hence Exception found");
	}
	else{
		return l*b;
	}
	
	
}
	public static void main(String[] args) {
		
		//Scanner o=new Scanner(System.in);
		Scanner t=new Scanner(System.in);
		
		System.out.println("Enter Length");
		int l=t.nextInt();
		System.out.println("Enter breadth");
		int b =t.nextInt();
		try{
			int r=display(l,b);
			System.out.println("area of rectangle is "+r);
		}
		catch(IOException ae){
			System.out.println(ae.getMessage());
		}
		
		

	}

}
