package exceptionhandeling;

import java.io.IOException;

public class ExceptionPropagation {

	public static void A() throws IOException {

		throw new IOException("Exception in A");
	}

	public static void B() throws IOException{
		A();
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		try {
			B();
		} catch (IOException a) {
			System.out.println("Exception in main: " + a.getMessage());
		}

	}

}
