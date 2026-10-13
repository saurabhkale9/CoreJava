package ExceptionHandeling;

import java.util.Scanner;

public class ThrowException2 {
	
	 void check() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter amount : ");
		int amount=sc.nextInt();
		
		if(amount<0) {
			throw new AmountNotfoundException("please enter valid amount");
		}
		else {
			System.out.println("amount is : "+ amount);
			
		}
	}
	public static void main(String[] args) {
		ThrowException2 t= new ThrowException2();
		
		try {
		t.check();
		}
		catch(AmountNotfoundException a) {
			System.out.println(a.getMessage()); 
			
		}

	}

}
