package Switch;

import java.util.Scanner;

public class $July22_SwitchCase1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter any character");
		
		char c =sc.next().charAt(0);
		
		String result=switch(c) {
		case 'a','e','i','o','u'-> "vowel";
		
		default -> "Consonent";
		};
		System.out.println(result);
		

	}

}
