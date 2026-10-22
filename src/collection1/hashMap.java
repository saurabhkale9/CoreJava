package collection1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class hashMap {

	public static void main(String[] args) {

		HashMap<String,String> map= new HashMap<String,String> ();
		map.put("Aadi", "Java Trainer");
		map.put("Saurabh","Student");
		map.put("Sk", "Trainer");
		
//		System.out.println(map);   //get all elements
//		System.out.println(map.size());	//get size of elements
//		System.out.println(map.isEmpty());	//check is empty or not
////		map.clear();   //to remove all the 
//		
//		System.out.println(map.keySet());		//get only keys
//		System.out.println(map.values());		//get only values
//		
//		System.out.println(map.get("Sk"));	    //pass key and retrieve value
//		System.out.println(map.containsKey("Saurabh"));
		
//		  ALT+SHIFT+L-->(shortcut)
		Set<Entry<String,String>>entryset=map.entrySet();
		
		map.entrySet();
		
		for(Entry<String,String> data :entryset) {
			System.out.println(data);
		}
	}

}
