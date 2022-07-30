package encapsulation;
class Shape{
	double area(int a,int b){
		return 0;
	}
	
}
class Rect extends Shape{
	 double area(int a,int b){
		return (a*b);
	}
}
class Tria extends Shape{
	 double area(int a,int b){
		return (0.5*a*b);
	}
}
class Sqr extends Shape{
	 double area(int a,int b){
		return (a*b);
	}
}
class Rhombus extends Shape{
	 double area(int a,int b){
		return (a*b);
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		Shape s;
		s=new Rect();
		System.out.println("Area of Rectangle is "+s.area(4,5));
		s=new Tria();
		System.out.println("Area of Triangle is "+s.area(9,5));
		s=new Sqr();
		System.out.println("Area of Square is "+s.area(3,5));
		s=new Rhombus();
		System.out.println("Area of Rhombus is "+s.area(6,5));

	}

}
