package package1;

import package1.M;
import package1.N;
import package1.P;

public class P  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new M().PublicMethod();
		new M().ProtectedMethod();
		//new M().defaultMethod();
		//new N().PublicMethod();
		new N().ProtectedMethod();
		new N().DefaultMethod();
		new P().MethodInP();
		

}
	public void MethodInP(){
		System.out.println( "value of int in class N is "+ new N().k);
	}
}