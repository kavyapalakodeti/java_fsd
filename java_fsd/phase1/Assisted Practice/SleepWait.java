package practiseprograms;

public class SleepWait extends Thread {
static SleepWait s=new SleepWait();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		    System.out.println( Thread.currentThread().getName() +   
		            " Thread is woken after two second");   
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		synchronized(s){
			try {
				s.wait(3000);
				System.out.println("Object is in waiting state and woken after 3 seconds");  
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

}
