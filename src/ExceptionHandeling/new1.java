package ExceptionHandeling;

public class new1 {

	public static void main(String[] args) {
		
		try {
			String name="saurabh";
			name=null;
			
			System.out.println(name.toUpperCase());
		}catch(NullPointerException n) {
			
//			System.out.println(n.getMessage());
//			1)- exception name
//			2) exception msg
//			3) exception lineno
			n.printStackTrace();
			
		}
		System.out.println("hii");

	}
}

