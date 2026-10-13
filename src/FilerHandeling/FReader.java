package FilerHandeling;

import java.io.FileReader;
import java.io.IOException;

public class FReader {
gf
	public static void main(String[] args) {
//		used for the shwoing data on the console
		try {
		FileReader file= new FileReader("C:\\Users\\userm\\OneDrive\\Desktop\\webpageHTML\\student.txt");
		int i=file.read();
		System.out.println((char)i);
		
		int data;
		while((data=file.read()) !=-1) {
			System.out.print((char)data);
			
			
		}
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
	}

}
