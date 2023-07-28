import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingTest {

	public static void main(String[] args) {
		System.out.println("Trying to read a file..");
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("queen.txt", true); //true means append to the file

		System.out.println("File is open....");
		
		String str="I have to go my HomeTown!!!";
		byte array[] = str.getBytes(); //converts the string into a byte array
		fileOutputStream.write(array);
		System.out.println("String is written to the file");

		fileOutputStream.close();
		System.out.println("\n File is closed now...");
		
	} 
		catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}