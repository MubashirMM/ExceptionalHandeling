package exceptionhandeling;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		try {
			int num = Integer.parseInt("ABC");
			System.out.println("Number is:"+num);
		} catch (NumberFormatException except) {
			System.out.println("Invalid farmat " + except);
		} catch (Exception e) {
			System.out.println("An error occured:" + e);
		} finally {
			System.out.println("This block always Execute!");
		}
	}

}
