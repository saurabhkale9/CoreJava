   package collection;

import java.util.LinkedList;

//import java.util.LinkedList;import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class LInkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> list= new LinkedList<Integer>();

		list.add(11);
		list.add(12);
		list.add(0);
		list.add(null);
		
		
		System.out.println(list.get(1));
		System.out.println(list.set(2, 22));
		System.out.println(list);
		
		
		
	}

}
