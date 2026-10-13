package ExceptionHandeling;

public class fun {
	
	void fun1() throws ArithmeticException {
		System.out.println(10/0);
		
	}
	public static void main(String[] args) {
		fun f= new fun();
		try {
		f.fun1();
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		
	}

}
