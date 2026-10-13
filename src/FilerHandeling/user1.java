package FilerHandeling;

import java.io.FileWriter;
import java.io.IOException;

public class user1 {
public static void main(String[] args) {
	user u= new user();
	u.setId(3);
	u.setAddress("dharashiv");
	u.setName("om");
	FileWriter fw =null;
	try {
	fw= new FileWriter("C:\\Users\\userm\\OneDrive\\Desktop\\webpageHTML\\student.txt",true);
	fw.write("\n ID : "+u.getId());
	fw.write("\n Address : "+u.getAddress());
	fw.write("\n Name : "+u.getName());
	System.out.println("data added in file");
	}catch(IOException e) {
		System.out.println(e.getMessage());
		
	}finally {							//finally block which is used for close the resources EX: fileWriter,connection cosing
										//finally will always execute
		try {
			fw.close(); 				//closing for the security
		}catch(IOException a) {
			a.printStackTrace();
			
		}
		
	}
}
}
