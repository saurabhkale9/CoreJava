package collection;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
	Integer x=30;
	Integer y=40;
	System.out.println(x+y);
	
//	collection --> Integer x= => valid
//	collection --> int x -> convert to Integer x => Valid

	
	Integer i=new Integer(3000);
	
	ArrayList<Integer> a1= new ArrayList<Integer>();
	a1.add(x);
	a1.add(y);
	a1.add(i);
	System.out.println(a1);
	}

}
