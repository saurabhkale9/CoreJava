package while_loop;

import java.util.Scanner;

public class $27June_while_loop1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter your pin..");
		int pin=sc.nextInt();
		
		int attempts=3;
		while(attempts>0) {
			if(pin==1212) {
				System.out.println("pin varified successfully");
				break;
			}else {
				attempts-=1;
				System.out.println("Pin is incorrect please Enter correct pin");
				System.out.println("try again ..");
				pin=sc.nextInt();
			}
			
		}
//		if(attempts<0) {
//			System.out.println("Account blocked");
//		}
		
		

	}

}
