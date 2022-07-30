
package practiseprograms;
import java.util.*;
public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Array List");
		ArrayList<String> city=new ArrayList<String>();
		city.add("Mumbai");
		city.add("Bnaglore");
		city.add("Delhi");
		city.remove("Pune");
		System.out.println(city);
		System.out.println("\nVector");
		Vector <Integer> v=new Vector <Integer>();
		v.add(3);
		v.add(10);
		v.add(9);
		v.add(15);
		System.out.println(v);
		System.out.println("\nLinkedList");
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(25);
		l.add(35);
		l.add(45);
		System.out.println(l);
	       System.out.println("\nHashSet");
	       HashSet<String> set=new HashSet<String>();  
	       set.add("jhon");  
	       set.add("Ram");  
	       System.out.println(set);

	    
	      
	       System.out.println("\nLinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2);
	      	} 

		
	}


