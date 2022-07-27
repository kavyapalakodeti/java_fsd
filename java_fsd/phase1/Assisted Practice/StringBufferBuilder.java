package string;

public class StringBufferBuilder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("STRING BUFFER");
		StringBuffer s=new StringBuffer("Started java");
		s.append(" Phase1");
		System.out.println(s);
		s.delete(2,5);
		System.out.println(s);
		s.replace(5,9,"python");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		System.out.println(s.charAt(9));
		System.out.println("STRING BUILDER");
		StringBuilder ss=new StringBuilder("Core");
		ss.append(" java");
		System.out.println(ss.length());
		System.out.println(ss.charAt(5));
		System.out.println(ss.insert(0,"Hi!! "));
		System.out.println(ss.delete(0,5));
		System.out.println(ss.reverse());
		
	}

}
