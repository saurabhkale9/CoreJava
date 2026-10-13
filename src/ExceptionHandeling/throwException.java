package ExceptionHandeling;

import java.util.Scanner;


//  throw is used for create user define  expetion with java/custom exception
public class throwException {
	
	static void check() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter age");
		int age= sc.nextInt();
		
		if(age<18) {
			throw new AgeNotValidException("please enter valid age");
			
		}else {
			System.out.println("eligible for voting");
		}
		
	}
	public static void main(String[] args) {
//		throwException t= new throwException();
		try {
		throwException.check();
		}catch(AgeNotValidException a){
			System.out.println(a.getMessage());
			
		}
	}

}
