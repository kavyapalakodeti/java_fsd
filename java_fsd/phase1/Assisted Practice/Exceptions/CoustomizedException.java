package practiseprograms;

public class CoustomizedException {
	
	static void salary(int n)throws SalaryException{
		if(n<=2100){
			throw new SalaryException("\nYou need to work hard");
		}
		if(n>2100 && n<=5000){
			throw new SalaryException("\nYour salary is somehow good");
		}
		if(n>5000&&n<=9000){
			throw new SalaryException("\nYour salary is very good");
		}
	}

	public static void main(String[] args) {
		try{
			salary(4000);
		}
		catch(Exception e){
			System.out.println("exception occured"+e.getMessage());
		}
	}
}
class SalaryException extends Exception{
	SalaryException(String s){
		super(s);
	}
}

