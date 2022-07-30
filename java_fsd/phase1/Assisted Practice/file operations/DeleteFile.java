package practiseprograms;
import java.io.File;
public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			File file=new File("E://phase1.txt");

			if(file.delete()){
				System.out.println(file.getName()+ " is deleted");
			}
			else {
				System.out.println("deletion failed");
			}
		}
		catch(Exception e){
			e.printStackTrace(); 
		}

	}

}
