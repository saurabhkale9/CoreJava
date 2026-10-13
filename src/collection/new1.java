package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class new1 {

	public static void main(String[] args) {
		
//		ways of creating arraylist

		ArrayList<Integer> a1= new ArrayList<Integer>();
		
		List<Integer> numbers= new ArrayList<Integer>();
		
		List<String> num=Arrays.asList("sau","shubham","om");
		System.out.println(num);
		
		
		List<Integer> numb =List.of(1,2,3,4);
		System.out.println(numb);
	}

}
