package practiseprograms;

public class RunnableExample implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RunnableExample r=new RunnableExample();
Thread t=new Thread(r);
t.start();
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Using Runnable Interface");
	}

}
