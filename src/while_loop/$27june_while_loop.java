package while_loop;

import java.util.Scanner;

public class $27june_while_loop {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		int num=sc.nextInt();
//		int n=10;
		
		while(num!=0) {
			if(num<0) {
				System.out.println("invalid statement");
				System.out.println("enter valid number");
				num=sc.nextInt();
				if(num>0) {
					System.out.println("number is valid");
				}
				
				
			
		}else {
			System.out.println("Number is valid ");
			break;
		}
	}

	}
}
