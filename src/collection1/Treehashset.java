package collection1;

import java.util.TreeSet;

public class Treehashset {

	public static void main(String[] args) {
		
		
		TreeSet<Integer> h1= new TreeSet<Integer>();
		
//		TreeSet — simple interview notes
//		1. Duplicates not allowed ✅
//		2. Insertion order not maintained ✅
//		3. Indexing not available ✅
//		4. null value not allowed ✅ with normal/natural ordering
//		5. HashCode is NOT used for storing/order ❌
//		6. Elements are stored in sorted order ✅
//		7. We can use Comparable or Comparator for sorting. ✅
//		treeset we can use for sort the data(ascending).

		
		h1.add(1);
		h1.add(1);
		h1.add(202);
		h1.add(22);
		h1.add(0);
//		h1.add(null);
//		h1.add(null);
		System.out.println(h1);
		
		
	}

}
