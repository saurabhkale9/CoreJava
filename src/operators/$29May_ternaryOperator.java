package operators;

import java.util.Scanner;

public class $29May_ternaryOperator {

	public static void main(String[] args) {
//		condition? expression1 : expression2

		String result = 10 < 20 ? "hi" : "hello";
		System.out.println(result);
		
		System.out.println("enter your exp :");
		
		Scanner sc = new Scanner(System.in);
		int exp = sc.nextInt();

		double salary = 45000;
		double finalsalary = exp > 5 ? salary + 5000 : salary + 2000;
		
		System.out.println("final salary is :"+finalsalary);
	}

}
