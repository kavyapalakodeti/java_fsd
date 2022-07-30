package practiseprograms;

import java.io.File;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myFile= new File("Data1.txt");
		 myFile= new File("C://Users//ACER//Desktop//filehandling//Data.txt");
		try {
			if(myFile.createNewFile())
			{
				System.out.println("Created File Succesfully..");
			}
			else
			{
				System.out.println("File Creation error");
			}
		}
		catch (Exception e){
			System.out.println("File Error");
		}
		
	}

}
