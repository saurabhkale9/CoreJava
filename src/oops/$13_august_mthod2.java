package oops;

public class $13_august_mthod2 {
	
	void add(int a , int b) {         // parameters 
		int c= a+b;   
		System.out.println("addition is "+c);
	}
	
	void sub(int a, int b) {
		int c= a-b;
		System.out.println("subtraction is "+c);
	}

	public static void main(String[] args) {
		
		$13_august_mthod2 m2= new $13_august_mthod2();
		m2.add(12, 12);               // arguments
		
		m2.sub(23, 3);

	}

}
