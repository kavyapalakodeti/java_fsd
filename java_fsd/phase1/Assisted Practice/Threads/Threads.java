package practiseprograms;

public class Threads extends Thread{
	public void run(){
		System.out.println("Extending thread class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threads t1=new Threads();
		t1.start();
	}

}
