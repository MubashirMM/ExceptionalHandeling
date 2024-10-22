package exceptionhandeling;

import java.io.*; 
import java.util.*;
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//create a new file 
			File file=new File("newFile.txt");
			if(file.createNewFile()){
				System.out.println("New File Created "+file.getName());
			}
			else {
				System.out.println("File Already Exist "+file.getName());
			}
			//file writer 
			FileWriter writer=new FileWriter("newFile.txt");
			writer.write("Muhammad Mubashir Saeed Ahmad.");
			writer.close();
			
			//create reader 
			Scanner reader=new Scanner(file);
			while(reader.hasNextLine()) {
			String data=reader.nextLine();
			System.out.println(data);
		 	}
			reader.close();
			
		}catch(IOException ioE) {
			System.out.println("Error ocuured while file handling!");
			ioE.printStackTrace();
		}
	}

}
