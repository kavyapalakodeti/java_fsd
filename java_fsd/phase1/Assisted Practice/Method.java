package methodsConstructors;

//public class Method {
//
//}


class A {
	int a,i,j;
	void test()
	{
		System.out.println("No Arguments");
	}
	void op(int x,int y)
	{
		a=(x/y);
		System.out.println("Division: "+a);
	}
	void result()
	{
		System.out.println("value of i is :"+i);
		System.out.println("Value of j is "+j);
	}

}
class Method{
	public static void main(String args[])
	{
		A obj=new A();
		obj.test();
		obj.op(100,50);
		obj.i=30;
		obj.j=40;
		obj.result();
	}
}
