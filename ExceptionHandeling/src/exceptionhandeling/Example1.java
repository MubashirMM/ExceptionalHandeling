package exceptionhandeling;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// basic exception handling
		try {
			int array[] = { 1, 2, 3 };
			System.out.println("Array Element is : " + array[3]);
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Array index out of bound" + exception);
		} finally {
			System.out.println("This block always Execute!");
		}
	}

}
