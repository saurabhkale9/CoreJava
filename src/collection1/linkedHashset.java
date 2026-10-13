package collection1;

import java.util.LinkedHashSet;

public class linkedHashset {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> h1= new LinkedHashSet<Integer>();
		h1.add(1);
		h1.add(1);
		h1.add(0);
		h1.add(null);
		h1.add(null);
		
		System.out.println(h1);

	}

}
