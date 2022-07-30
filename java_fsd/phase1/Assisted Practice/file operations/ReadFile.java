package practiseprograms;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] array =new char[50];
		
		try{
			
			FileReader o=new FileReader("C://Users//ACER//Desktop//filehandling//Data.txt");
			
			o.read(array);
			System.out.println("Data in file is: ");
			System.out.println(array);
			o.close();
		}
		catch(Exception e){
			e.getStackTrace();
		}
	}

}
