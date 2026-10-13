package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
//		ArrayList<Integer> a1= new ArrayList<Integer>();
//
//		a1.add(0,200);
//		a1.add(1,300);
//		a1.add(2,500);
//		a1.add(400);
//		a1.add(3,800);
//		a1.add(4,50);//
//		
//		System.out.println(a1);
//		
		
//		ArrayList<Object> a1= new ArrayList<Object>();
//				a1.add(200);
//				a1.add("Ram"); 
//				a1.add(22.4);	
//				a1.add('A');
//				System.out.println(a1);
//				.
		
//		ArrayList<String> a1= new ArrayList<String>();
//		a1.add("sau");
//		a1.add("gau");
//		System.out.println(a1);
//		System.out.println(a1.get(0));
//		System.out.println(a1.get(1));
			
			
		
		ArrayList <String> a2= new ArrayList<String>();
		a2.add("sau");
		a2.add("gau");
		a2.add("hii");
		a2.add("bye");
		a2.add("sau");
		
		
//	1)	 Iterratin of arraylist
		
//		for(int i=0;i<a2.size();i++) {
//			System.out.println(a2.get(i));
//		}
		
//		2)	 for each loop
//		for(String s:a2) {
//			System.out.println(s);
//		}
		
		
//		3) iterrator() method
		
//		Iterator<String> itr=a2.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}

//		4) List Iterator
		
		ListIterator<String> ltr=a2.listIterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		
		System.out.println("============");
		
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
		
//		ArrayList <String> a3= new ArrayList<String>();
//		a3.add("Prakash");
//		a3.add("ganesh");
//		a3.add("sanket");
//		a3.add("rohit");
//		a3.add("pratik");
//		
//		a2.addAll(a3);
//		
//		System.out.println(a2.contains("pratik"));
//		System.out.println(a2.size());
//		System.out.println(a2.set(1, "Ram Ram"));
//		System.out.println(a2.get(1));
//		System.out.println(a2.remove(1));
//		System.out.println(a2.remove("sau"));
//		System.out.println(a2.contains("hii"));
//		System.out.println(a2.indexOf(0));
//		a2.clear();
//		System.out.println(a2.isEmpty());
		
//		System.out.println(a2);
//		System.out.println(a2.lastIndexOf("sau"));
//		System.ou t .println(a2.reversed());
	}

}
