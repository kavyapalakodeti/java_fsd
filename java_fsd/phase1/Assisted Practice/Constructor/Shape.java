package methodsConstructors;

public class Shape {
	int x;
	float y;
	double z,t,rh;
	Shape(){
		
	}
	Shape(int s){
		x=(s*s);
	}
	Shape(float l, float b){
		y=(l*b);	
	}
	Shape(double r){
		z=(3.14*r*r);
	}
	void displaySquare(){
		System.out.println("area of square is " +x);
	}
	void displayRect(){
		System.out.println("area of rectangle is " +y);
	}
	void displayCircle(){
		System.out.println("area of circle is " +z);
	}
	void area(float k, float l){
		t=(0.5*k*l);
		System.out.println("area of triangle is " +t);
	} 
	void area(double d1, double d2){
		rh=(0.5*d1*d2);
		System.out.println("area of rhombus is " +rh);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1=new Shape(14);
		Shape s2=new Shape(5,2);
		Shape s3=new Shape(6.5);
		Shape s4=new Shape();
		Shape s5=new Shape();
		s1.displaySquare();
		s2.displayRect();
		s3.displayCircle();
		s4.area(21.5,10.2);
		s5.area(21,10);
		
	}

}
