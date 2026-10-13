package FilerHandeling;

import java.io.File;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		
//		for(int i=1;i<=10;i++) {

		File file= new File("C:\\Users\\userm\\OneDrive\\Desktop\\webpageHTML\\saurabh.py");
		
		file.delete();
		System.out.println("deleted successfully");
		try{
			
			if(file.createNewFile()){
				System.out.println("file created sucessfully");
			}else {
				System.out.println("file already exists");
			}
		}catch(IOException a) {
			System.out.println(a.getMessage());
		}
		

	}
//	}

}
