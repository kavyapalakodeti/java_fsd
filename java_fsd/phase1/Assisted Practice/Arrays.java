import java.util.Scanner;
public class Arrays {
public static void main(String[] args) {
		
int a[],i;
System.out.println("SINGLE DIMENSIONAL ARRAY");
System.out.println("Enter no.of elements of single dimensional array : ");
Scanner s=new Scanner(System.in);
 int n=s.nextInt();
 a = new int[n]; 
 System.out.println("Enter "+n+ " elemrmts :");
 for(i=0;i<n;i++){
 a[i]=s.nextInt();
 }
 for(i=0;i<n;i++){
	 System.out.println("Element at position " +i+ " is " +a[i]);
 }
 System.out.println("MULTI DIMENSIONAL ARRAY");
 int b[][] = {
         {1, 4, 7}, 
         {2, 5, 8},
         {3, 6, 9}};
 System.out.println("\nLength of row 1: " + b[0].length);
 System.out.println("\nLength of row 2: " + b[1].length);
 System.out.println("\nLength of row 3: " + b[2].length);
 s.close();
	}

}
