package practiseproject;
import java.util.Scanner;
public class VerifyEmail {

	public static void main(String[] args) {
		String array[]={"kavya5a9@sasi.ac.in",
				"kavyapalkodeti3@gmail.com",
				"palakodetikavya2001@gmail.com",
				"divya569@sasi.ac.in",
				"pavanikonkalla3@gmail.com",
				"sivanimedapati@gmial.com",
				"lswift@gmail.com",
				"floyd12@blanda.com",
				"jeanie.boyer@yahoo.com",
				"ukuhlman@hotmail.com",
				"sydnie49@labadie.com",
				"emard.werner@yahoo.com",
				"jakubowski.emiliano@gmail.com",
				"athena25@yahoo.com",
				"wmcdermott@hotmail.com",
				"gutkowski.maeve@blick.com"};
		Scanner e = new Scanner(System.in);
	    System.out.println("Enter Email");
	    String b = e.nextLine();
		boolean f=false;
		int i,a=0;
	for(i=0;i<array.length;i++){
		if(b.equals(array[i])){
			a=i;
			f=true;
			break;
		}
	}
	if(f==true){
		System.out.println("email found at "+i+" index in array");
	}
	else{
		System.out.println("Email not found !!!");
	}

	}

}
