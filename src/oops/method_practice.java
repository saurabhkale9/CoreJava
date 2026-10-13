package oops;

public class method_practice {

	int add(int a,int b) {
		return a+b;
	}
	
	String name(String name) {
		return name;
	}
	
	float k() {
		return 22.8f;
	}
	public static void main(String[] args) {
		
		method_practice m1= new method_practice();
		int add=m1.add(12, 20);
		System.out.println(add);
		
		String k=m1.name("saurabh");
		System.out.println(k);
		
		System.out.println(m1.k());
	}
}
