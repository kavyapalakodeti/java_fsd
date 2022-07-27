package demo;

public class Typecasting {

	public static void main(String[] args) {
		//float to long
		float f=93.4f;
		long l=(long)f;
		System.out.println("converted from float to long"+l);
		//double-->long-->int-->char
		double d=81.6764433d;
		long a= (long)d;
		int b=(int)a;
		char c=(char)b;
		System.out.println("converted from double to long "+a);
		System.out.println("converted from long to int "+b);
		System.out.println("converted from int to char "+c);
		//long to byte
		byte n=(byte)l;
		System.out.println("converted from byte to char "+n);
		//int-->double-->long
		d=b;
		long i=(long)d;
		System.out.println("converted from double to long "+i);
		
	}

}
