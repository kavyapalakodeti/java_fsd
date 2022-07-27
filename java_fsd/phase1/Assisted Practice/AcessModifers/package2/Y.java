package package2;

import package1.N;
import package1.M;
public class Y extends N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new X().PublicMethod();
		new N().PublicMethod();
		new M().PublicMethod();
		
		new Y().ProtectedMethod();
		System.out.println( "value of int in class N is "+ new N().k);
		System.out.println( "value of long in class X is "+new X().l);
		System.out.println( "value of float in class X is "+new X().f);
		System.out.println( "value of char in class X is "+new X().c);
	}

}

