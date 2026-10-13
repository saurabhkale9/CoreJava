package oops;

public class method3 {
	
	int a() {
		
		return 22;
	}
	
	int b() {
		return 34;
	}
	
	String name() {
		return "Saurabh";
	}

	String add(String a,String b) {
		return a+b;
	}
	
	double k() {
		return 100*200/23;
	}
	String m() {
		String m="saurabh";
		String n="kale";
		return m+n;
	}
	public static void main(String[] args) {
		
		method3 m3= new method3();
		System.out.println(m3.a());
		int c=m3.b();
		System.out.println(c);
		
		System.out.println(m3.name());
		
		String a=m3.add("sau", "gau");
		System.out.println(a);

		String l=m3.m();
		System.out.println(l);
	}

}
