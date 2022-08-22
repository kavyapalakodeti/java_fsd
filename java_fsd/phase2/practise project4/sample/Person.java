package sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import sample.PersonFile;

public class Person {
	
	public void add(int i,String pname, int p){
		PersonFile pf=new PersonFile();
		pf.setPid(i);
		pf.setPname(pname);
		pf.setPprice(p);
		
		
	}
public void main(int i,String pname, int p){
	
	Configuration cfg = new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory factory = cfg.buildSessionFactory();
    
    Session session = factory.openSession();
    
    Transaction t = session.beginTransaction();
	 t.commit();  // commit() in DB
        
      factory.close();  
      session.close(); 
    
   
}



}
