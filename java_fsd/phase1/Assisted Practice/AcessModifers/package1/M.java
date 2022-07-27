package package1;

public class M {
	public void PublicMethod(){
		PrivateMethod();
		defaultMethod();
		
	}
	void defaultMethod(){
		System.out.println( "value of long in class M is "+ l);
	}
	private void PrivateMethod(){
		System.out.println( "value of int in class M is "+ a);
	}
	protected void ProtectedMethod(){
		System.out.println( "value of float in class M is "+ b);
	}
 
 long l=235l;
 private int a=20;
 protected float b=23.5f;
	
}
