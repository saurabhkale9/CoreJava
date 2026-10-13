package operators;

import java.util.Scanner;



public class $29May_NextedTernary {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter marks :");
		int marks = sc.nextInt();
		
		String result= (marks>95)?"A": (marks>=75)?"B":
			(marks>=50)?"C":
				(marks>50)?"C":"FAIL";
		System.out.println(result);
		
	}

}
