package ExceptionHandeling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter age :");
		
		try {
		int age= sc.nextInt();
		System.out.println("age is : "+age);
		}
		catch(InputMismatchException e) {
			
			System.out.println(e.getMessage());
		}
		

	}

}
