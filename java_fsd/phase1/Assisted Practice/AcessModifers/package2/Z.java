package package2;

import package1.M;
import package1.P;
import package1.N;
public class Z extends N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new X().PublicMethod();
		new N().PublicMethod();
		new M().PublicMethod();
		
		new Z().ProtectedMethod();
		new P().MethodInP();
		System.out.println( "value of long in class X is "+new X().l);
		System.out.println( "value of float in class X is "+new X().f);
		System.out.println( "value of char in class X is "+new X().c);
	
	}

}