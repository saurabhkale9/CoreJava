package FilerHandeling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class student {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

//		File file= new File("C:\\Users\\userm\\OneDrive\\Desktop\\webpageHTML\\student.txt");
//		
//		try {
//			
//		file.createNewFile();
//		
//		System.out.println("file created");
//		
//		}catch(IOException a) {
//			System.out.println(a.getMessage());
//			
//		}
		int num[]= {11,22,33,44,55,66,77,88};
		
		int a=10,b=20;
		try {
		FileWriter fw= new FileWriter("C:\\Users\\userm\\OneDrive\\Desktop\\webpageHTML\\student.txt",true);
		fw.write("heyy,bye");
		fw.write("\n Addition : "+(a+b));
		for(int i=0;i<num.length;i++) {
			fw.write("\n Array numbers are : "+ num[i]);
		}
		fw.flush();     //to save the data
		System.out.println("data added in file");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		}

}
