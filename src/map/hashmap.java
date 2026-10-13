package map;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		HashMap<String, String> map= new HashMap<String,String>();
		map.put("saurabh", "Java Trainer"); 	//1 Entry
		map.put("Shubham","Python Trainer");	//2 Entry
		map.put("sanket", "Python Trainer" );
		map.put("saurabh", "AI");  
		
		
		System.out.println(map);
		

	}

}
