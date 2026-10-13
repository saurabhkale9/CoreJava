package oop2;

public interface test {
	
	void login();

	
	static void m1() {
		System.out.println("m1");
		
	}
	
	private static void m2() {
		
	System.out.println("m2");
	m1();
	}
	
//	default method
//	for calling m3 implemented class required to call default method
	public default void m3() {
		System.out.println("m3");
		m2();
	}
	public static void main(String[] args) {
		
		test.m1();
		

	}

}
