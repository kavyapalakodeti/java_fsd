package practiseprograms;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k=new Scanner(System.in);
		System.out.println("Enter Data ");
		 String data = k.nextLine();
		
		try{
			
			FileWriter o=new FileWriter("C://Users//ACER//Desktop//filehandling//Data.txt");
			
			o.write(data);
			System.out.println("Data is written to file");
			o.close();
		}
		catch(Exception e){
			e.getStackTrace();
		}
	}

}
