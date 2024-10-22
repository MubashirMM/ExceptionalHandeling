package exceptionhandeling;


public class custumException {

	public static void validateAge(int age) throws Example6_InvalidAgeException{
		if(age<18) {
			throw new Example6_InvalidAgeException("Invalid Age");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	validateAge(12);
}catch(Example6_InvalidAgeException a) {
	System.out.println("Custom Exception:"+a.getMessage());
}
		
}
}
