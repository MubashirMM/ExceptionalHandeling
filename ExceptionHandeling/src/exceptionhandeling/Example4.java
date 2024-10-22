package exceptionhandeling;

import java.io.*; 

public class Example4 {

	// validate file function
	public static void validateFile() throws IOException {

		File file = new File("example.txt");
		if (!file.exists()) {
			throw new IOException("File not found!");
		}
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validateFile();
		} catch (IOException ioe) {
			System.out.println("IO Exception occurred!");
		}
	}

}
