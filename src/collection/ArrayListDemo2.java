package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		
//		ArrayList<Integer> i1= new ArrayList<Integer>();
//		
//		i1.add(22);
//		i1.add(23);
//		i1.add(24);
//		
//		
//		System.out.println(i1);

		Student s1= new Student();
		s1.setId(1);;
		s1.setName("saurabh");
		s1.setAddress("katraj");
		
		Student s2= new Student();
		s2.setId(2);
		s2.setName("sunny");
		s2.setAddress("daund");
		
		Student s3= new Student();
		s3.setId(3);
		s3.setName("shubham");
		s3.setAddress("dhankawadi");
		
		ArrayList<Student> i1= new ArrayList<Student>();
		
		i1.add(s1);
		i1.add(s2);
		i1.add(s3);
		
		
//		for(int i=0;i<i1.size();i++) {
//			System.out.println(i1.get(i));
//		}

		
		for(Student s:i1) {
			System.out.println("ID : "+s.getId());
			System.out.println("Name : "+s.getName());
			System.out.println("Address : "+s.getAddress());
			System.out.println("=================");
		}
		
//			i1.iterator();
//			
//			Iterator<Student> iterator= i1.iterator();
//			while(iterator.hasNext()) {
//				System.out.println(iterator.next());
//			}
		
		
//		i1.iterator();
//		
//		ListIterator<Student> iterator= i1.listIterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}

	}

}
