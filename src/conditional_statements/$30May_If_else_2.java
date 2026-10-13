package conditional_statements;

import java.util.Scanner;

public class $30May_If_else_2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter product price :");
		double price = sc.nextInt();
		
		if(price>10000) {
			
			double discount = price*0.10;
			price= price-discount;
			System.out.println("discount applied 10% "+ discount);
			System.out.println("Final price "+ price);
			
		}
		else {
			System.err.println("discount not applied");
		}

	}

}
