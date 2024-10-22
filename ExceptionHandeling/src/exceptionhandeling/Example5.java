package exceptionhandeling;

import java.io.*;
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(FileWriter writer=new FileWriter("example.txt")){
			writer.write("This file will automatically closed!");
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		finally {
			System.out.println("Always Remaining code!");
		}
	}

}
