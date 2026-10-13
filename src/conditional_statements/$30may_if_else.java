package conditional_statements;

import java.util.Scanner;

//it  can checks only one conditions and executes

public class $30may_if_else {

	public static void main(String[] args) {
//		System.out.println("Enter your age:");
		Scanner sc= new Scanner(System.in);
//		int age= sc.nextInt();
//		if(age>=18) {
//			System.out.println("you can vote");
//		}else {
//			System.out.println("cannot vote");
//		}
		
		double balance= 45000;
		System.out.println("Enter widrawal amount :");
		double widrawal = sc.nextDouble();
		
		if(widrawal<=balance) {
//			balance= balance-widrawal;
			balance-=widrawal;
			System.out.println("Widrawal sucessfull : remaining amount :"+ balance);
		}else {
			System.out.println("insuffiecient funds");
		}
		

	}
	
	

}
