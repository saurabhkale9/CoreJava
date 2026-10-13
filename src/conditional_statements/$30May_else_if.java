package conditional_statements;

import java.util.Scanner;

public class $30May_else_if {

	public static void main(String[] args) {

		System.out.println("Enter price :");
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		if (price > 10000) {	
			System.out.println("discount applied 10%");
			
			double discount = price*0.10;
			price-=discount ;
			System.out.println("Final price :"+price);
		} else if (price > 7000) {
			System.out.println("discount applied  7%");
			double discount = price*0.07;
			price-=discount ;
			System.out.println("Final price :"+price);
		} else if (price > 5000) {
			System.out.println("Discount applied 5%");
			double discount = price*0.05;
			price-=discount ;
			System.out.println("Final price :"+price);
		} else {
			System.out.println("No disocunt applied");
		}

	}

}
