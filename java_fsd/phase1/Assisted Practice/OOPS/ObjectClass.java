package encapsulation;
public class ObjectClass {
	String firstname; 
    String lastname; 
    int age; 
    public ObjectClass(String firstname, String lastname, int age) 
    { 
        this.firstname = firstname; 
        this.lastname = lastname; 
        this.age = age; 
       
    } 
    public String getFirstName() 
    { 
        return firstname; 
    } 
    public String getLastName() 
    { 
        return lastname; 
    } 
    public int getAge() 
    { 
        return age; 
    } 
   
    @Override
    public String toString() 
    { 
        return("Hi my name is: "+ this.getFirstName()+" "+ this.getLastName()+".\n My age is: " + this.getAge()+"."); 
    } 
    public static void main(String[] args) 
    { 
    	ObjectClass o = new ObjectClass("Kavya","Palakodeti", 21); 
        System.out.println(o.toString()); 
    } 
}

