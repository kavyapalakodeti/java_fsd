package phaseEndProjects;
import java.awt.Label;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
 class Ticket {
	int count=0;
	LinkedList al = new LinkedList();
	LinkedList<String>  A=new LinkedList<String>();
	LinkedList <String> B=new LinkedList<String>();
	LinkedList <String> C=new LinkedList<String>();
	LinkedList <String> D=new LinkedList<String>();
	LinkedList <String> E=new LinkedList<String>();	
public void Bookseat(int a, String name, int n1){
	al.add(A);
	al.add(B);
	al.add(C);
	al.add(D);
	al.add(E);
	for(int j=0;j<=6;j++){
		if(j==n1-1){
			int i=a;
			Object r = al.get(j);
			if(((LinkedList) al.get(j)).get(i)!="0"){
				System.out.println("BUT THIS SEAT IS NOT AVAILABLE ");
			}
			else{
				((LinkedList) al.get(j)).set(a,name);
				
				count++;
				System.out.println("TICKET BOOKED SUCESSFULLY");
			}
		}		
		}
	}
}
public class TicketBooking{
	static int username=123;
	static int password=123;
	static char anotherticket;
public static void main(String[] args) {
	try{
		Ticket tb=new Ticket();
		Scanner o=new Scanner(System.in);
		for(int i=0;i<10;i++){
			tb.A.add("0");
			tb.B.add("0");
			tb.C.add("0");
			tb.D.add("0");
			tb.E.add("0");
		}
		System.out.println("**********Welcome TO Movie Ticket Booking Simulator***********");
		System.out.println("for admin username-->123, password-->123");
		System.out.println("_______________________________________________________________");
		System.out.println("Are you a User or Admin");
		System.out.println("A-->Admin\nU-->User");
		char n = o.next().charAt(0);
		if(n=='A'||n=='a'){	
			System.out.println("Enter username");
			int u=o.nextInt();
			System.out.println("Enter password");
			int p=o.nextInt();
			if(u==username&&p==password){
				System.out.println("Login Sucess");
				System.out.println("To update password enter---> Y/y");
				char n1 = o.next().charAt(0);
				if(n1=='Y'||n1=='y'){
					System.out.println("enter old password ");
					int old=o.nextInt();
					System.out.println("enter new password (ONLY NUMBERS ALLOWED)");
					int ne = o.nextInt();
					if(old==password){
					password=ne;
					System.out.println("Password updated sucessfully");
					}
					else{
						System.out.println("Old password dosent match");
					}
				}	
			}
			else{
				System.out.println("Invalid username or password");
			}
		}
		if(n=='U'||n=='u'){
			while(true){
			System.out.println("Hello!!! Ticket booking is open for August 6--August 11");
			System.out.println("enter dates between 6-11\n0-->exit");
			int day=o.nextInt();
			if(day==0){
				System.exit(0);
			}
			if(day==6||day==7||day==8||day==9||day==10||day==11){
				System.out.println("Available shows are:\n1-->10AM-1PM\n2-->2PM-5PM\n3-->6PM-9PM");
				int st=o.nextInt();
				for(int i=0;i<10;i++){
					tb.A.set(i,"0");
					tb.B.set(i,"0");
					tb.C.set(i,"0");
					tb.D.set(i,"0");
					tb.E.set(i,"0");
				}
				if(st==1||st==2||st==3){
					for(int i=0;i<10;i++){
						tb.A.set(i,"0");
						tb.B.set(i,"0");
						tb.C.set(i,"0");
						tb.D.set(i,"0");
						tb.E.set(i,"0");
					}
					System.out.println("Enter your name");
					String name=o.next();
		do{	
			System.out.println("Select the Row");
			System.out.println("1-->A Row\n2-->B Row\n3-->C Row\n4-->D Row\n5-->E Row\n0-->exit");
			int n1=o.nextInt();
			if(n1==1||n1==2||n1==3||n1==4||n1==5){
			switch(n1){
			case 1:		System.out.println("select the seat no from 1-10");
						int a=o.nextInt();
						tb.Bookseat(a-1,name,n1);
						break;
			case 2:		System.out.println("select the seat no from 1-10");
						int b=o.nextInt();
						tb.Bookseat(b-1,name,n1);
						break;
			case 3:		System.out.println("select the seat no from 1-10");
						int c=o.nextInt();
						tb.Bookseat(c-1,name,n1);
						break;
			case 4:		System.out.println("select the seat no from 1-10");
						int d=o.nextInt();
						tb.Bookseat(d-1,name,n1);
						break;
			case 5:		System.out.println("select the seat no from 1-10");
						int e=o.nextInt();
						tb.Bookseat(e-1,name,n1);
						break;
				case 0: System.exit(0);
			}
		}
		else{
			System.out.println("invalid choice");
		}
		System.out.println("Do you want to book another ticket Yes--Y/y\nNo-->N/n");
			 anotherticket = o.next().charAt(0);
		}while(anotherticket=='Y'||anotherticket=='y');
		System.out.println("Total Amount is " +(100*tb.count));
		System.out.println("To view your seats enter y \nyes-y/Y/no-n/N");
		char bos = o.next().charAt(0);
		if(bos=='Y'||bos=='y'){
				System.out.println("Your seats for "+day+"-August");
				System.out.println(tb.A);
				System.out.println(tb.B);
				System.out.println(tb.C);
				System.out.println(tb.D);
				System.out.println(tb.E);	
		} 
		}
		else
					System.out.println("Invalid choice!! ");
}
			else
				System.out.println("Invalid choice!! ");	
		}
		}
	}
	catch(Exception e){
		System.out.println(e);
		System.out.println("Invalid choice");
		System.exit(0);
	}
	}
}
		


