package practiseprograms;
class Outer {
	int x=30;
	void test(){
		Inner o=new Inner();
		o.display();
	}
	class Inner{
		void display(){
			System.out.println("Value of x from outer class is "+x);
		}
		
	}
}
public class InnerClass{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer i=new Outer();
		i.test();

	}
}

