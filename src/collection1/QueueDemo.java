package collection1;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {

	
		
		PriorityQueue<Integer> p= new PriorityQueue<Integer>();
		p.add(1);
		p.add(1);
//		p.add(null);
		p.add(0);
		p.add(-12);
		p.add(23);
		p.add(24);
		p.add(11);
		p.add(199);
		
		System.out.println(p);
	}

}
