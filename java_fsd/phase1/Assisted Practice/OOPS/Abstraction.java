package encapsulation;

abstract class Mnc{
	abstract void method1();
	abstract void method2();
	Mnc(){
		System.out.println("Inside the Mnc constructor");
	}
	void normalmethod(){
		System.out.println("Inside the normal method of Mnc class");
	}
}
abstract class Infosys extends Mnc{
	void method1(){
		System.out.println("Inside the method1");
	}
	abstract void method2();
}
abstract class Hello extends Infosys{
	void method1(){
		System.out.println("Inside the method1");
	}
	void method2(){
		System.out.println("Inside the method2");
	}
	void normalmethod1(){
		System.out.println("Inside the normal method of hello class");
	}

}
public class Abstraction extends Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction m=new Abstraction();
		m.normalmethod();
		m.method1();
		m.method2();
		m.normalmethod1();
		
		
		
		
	
		
	}

}
