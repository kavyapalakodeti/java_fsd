package practiseprograms;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;

import java.io.FileOutputStream;

import java.io.IOException; 

public class FileAppend {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		 DataInputStream dis=new DataInputStream(System.in); 
		 FileOutputStream fout=new FileOutputStream("C://Users//ACER//Desktop//filehandling//Data.txt",true); 
		
		BufferedOutputStream bout=new BufferedOutputStream(fout,1024); 
        System.out.println("Enter text (@ at the end):"); 
        char ch; 
       
        while((ch=(char)dis.read())!='@') 
       { 
            bout.write(ch); 
          
       } 
        System.out.println("Append Succesfully");
           bout.close(); 
    } 
 

	}





