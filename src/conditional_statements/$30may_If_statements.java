package conditional_statements;

import java.util.Scanner;

//in if we can only write one if condition it will checks both the condition 

public class $30may_If_statements {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int age= sc.nextInt();
		if(age>=18) {
			System.out.println("can vote");

		}
		if(age<18) {
			System.out.println("cannot vote");
		}
		

	}

}
