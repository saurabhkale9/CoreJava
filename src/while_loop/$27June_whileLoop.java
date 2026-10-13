package while_loop;

import java.util.Scanner;

public class $27June_whileLoop {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter Username");
		String username= sc.next();
		
		while(true) {

			if(username.length()<5) {
				System.out.println("invalid usaername");
				System.out.println("Enter a valid username");
				username= sc.next();
				
			}else {
				System.out.println("valid username");
				break;
			}
		}
		
		
		
	}

}
