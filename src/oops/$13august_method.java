package oops;

public class $13august_method {

	void add() {
		int a= 10;
		int b=20;
		int c= a+b;
		System.out.println("addition is "+c);
	}
	void sub() {
		int a=20;
		int b=20;
		int c= a-b;
		System.out.println("substraction is "+c);
	}
	
	void mul() {
		int a=20;
		int b=10;
		int c= a*b;
		System.out.println("division is "+c);
	}
	
	void div() {
		int a=20;
		int b=10;
		int c= a/b;
		System.out.println("division is "+c);
	}
	
	public static void main(String[] args) {
		
		$13august_method m1= new $13august_method();
		m1.add();
		m1.sub();
		m1.mul();
		m1.div();
	}
}
