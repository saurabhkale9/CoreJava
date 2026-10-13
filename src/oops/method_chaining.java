package oops;



public class method_chaining {

	void m1() {
		System.out.println("m1");
		m2();
	}
	void m2() {
		System.out.println("m2");
		m3();
	}
	void m3() {
		System.out.println("m3");
	}
	public static void main(String[] args) {
		method_chaining m1= new method_chaining();
		m1.m1();
		
		

	}

}
