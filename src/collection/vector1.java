package collection;

import java.util.Stack;
import java.util.Vector;

public class vector1 {

	public static void main(String[] args) {
		Vector<Integer> v1= new Vector<Integer>();
		
//		legacy class
//		synchronized
//		thread safe class
		
		
//		v1.add(11);
//		v1.add(23);
//		v1.add(23);
//		v1.add(null);
//		v1.add(0);
//		System.out.println(v1);
		
		
		
		Stack<Integer> s1= new Stack<Integer>();
		s1.add(20);
		s1.add(34);
		s1.add(22);
		s1.add(null);
		s1.add(0);
		s1.add(24 );
		System.out.println(s1.peek());		//gave top element
		System.out.println(s1.pop());     //remove top element
		System.out.println(s1);
		
		
	}

}
