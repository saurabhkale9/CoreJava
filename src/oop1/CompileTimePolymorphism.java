package oop1;

public class CompileTimePolymorphism {
	
//	void study() {
//		System.out.println("Student is doing study using mobile");
//	}
//
//	void study(int i) {
//		System.out.println("Student is study using laptop");
//	}
//	
//	void study(int i,int j) {
//		System.out.println("Student is study using tab");
//	}
	
	void study(int i,String j) {
		System.out.println("student method");
	}
	
	void study(String j,int i) {
		System.out.println("student second method");
	}
	public static void main(String[] args) {

		CompileTimePolymorphism  c1= new CompileTimePolymorphism();
		c1.study(1,"saurabh");
		c1.study("Sunny",1);
//		c1.study(1, 2);
		
		
		
	}

}
