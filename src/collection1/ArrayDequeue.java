package collection1;

import java.util.ArrayDeque;

public class ArrayDequeue {

	public static void main(String[] args) {

		ArrayDeque<Integer> a= new ArrayDeque<Integer>();

		a.add(22);

//		a.add(null);
		a.add(22);
		a.add(0);
		a.add(1);
		a.add(23);
		a.add(-23);
		
		System.out.println(a);
//		System.out.println(a.peek());
//		System.out.println(a.peekFirst());		return first element without remivng it
//		System.out.println(a.peekLast());		return first element without remivng it
		System.out.println(a.pop());
		System.out.println(a);
		
		System.out.println(a.pollFirst());
		System.out.println(a.pollLast());
		System.out.println(a);
		
		System.out.println(a.poll());
		System.out.println(a);
	}

}
