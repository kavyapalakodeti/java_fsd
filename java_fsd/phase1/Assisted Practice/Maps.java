package practiseprograms;
import java.util.*;
public class Maps {
	public static void main(String[] args) {
		
		//Hashmap
		  System.out.println("Hashmap");
		  HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"EEE");    
	      hm.put(2,"ECE");    
	      hm.put(3,"CSE");   
	      hm.put(4, null);
	      System.out.println(hm);
	      hm.remove(1);
	      System.out.println("Element at key 2:\t"+hm.get(2));
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      //Hashtable
	      System.out.println("Hashtable");
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
	      ht.put(5,"IT");
	      ht.put(6, "MECH");
	      System.out.println(ht);
	      System.out.println("The elements of Hashmap are ");  
	      for(Map.Entry n:ht.entrySet()) {
	    	  System.out.println(n.getKey()+" "+n.getValue());
	      }
	      //TreeMap
	      System.out.println("Tree Map");
	      TreeMap<Integer,String> tm=new TreeMap<Integer,String>();   
	      tm.put(7, "AI");
	      tm.put(8, "ML");
	      System.out.println("The elements of Hashmap are ");  
	      for(Map.Entry o:tm.entrySet()) {
	    	  System.out.println(o.getKey()+" "+o.getValue());
	      }
	      
	}
}
