package encapsulation;
class Product{
	int id=78;
	String name="ämul";
	
	void display(int id,String name){
		
		System.out.println(" id is: "+id);
		System.out.println(" name is: "+name);
		this.id=id;
	}
}
class A extends Product{
	int count;
	String category;
	void display(int count,String category){
		
		System.out.println(" count is: "+count);
		System.out.println(" category is: "+category);
		System.out.println(" id is: "+super.id);
		System.out.println(" name is: "+super.name);
	}
	
}
class B extends Product{
	int count;
	String category;
	void display(int count,String category){
		System.out.println(" count is: "+count);
		System.out.println(" category is: "+category);
		System.out.println(" id is: "+super.id);
		System.out.println(" name is: "+super.name);
	}
}
class C extends Product{
	int count;
	String category;
	void display(int count,String category){
		System.out.println(" count is: "+count);
		System.out.println(" category is: "+category);
		System.out.println(" id is: "+super.id);
		System.out.println(" name is: "+super.name);
	}
	
}
class SubA extends A{
	int price;
	int total_price=(count*price);
	void display(int price,String category){
		System.out.println(" total price is: "+total_price);
		System.out.println(" category is: "+category);
		System.out.println(" id is: "+super.id);
		System.out.println(" name is: "+super.name);
	}
}
class SubB extends B{
	int price;
	int total_price=(count*price);
	void display(int price, String category){
		System.out.println(" total price is: "+total_price);
		System.out.println(" category is: "+category);
		System.out.println(" id is: "+super.id);
		System.out.println(" name is: "+super.name);
}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product p1=new Product();
p1.display(78,"amul");
A a1=new A();
a1.display(50, "butter");
B b1=new B();
b1.display(90, "milk");
C c1=new C();
c1.display(56, "choco");
SubA a=new SubA();
a.display(30, "butter");
SubB b=new SubB();
b.display(10,"milk");


}
}
