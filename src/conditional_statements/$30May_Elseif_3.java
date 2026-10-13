package conditional_statements;

import java.util.Scanner;

public class $30May_Elseif_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Shopping application :");
		System.out.println("1.Laptop - 30000 RS ");
		System.out.println("2.Iphone - 120000 RS ");
		System.out.println("3.Tshirt -1800 RS");
		System.out.println("4.TV  11000RS");
		
		 System.out.println("ENTER YOURS CHOICE TO PURCHASE ANY PRODUCT (1-4)");
		 int choice = sc.nextInt();
		 double price=0;
		 String product="";
		 double discount=0;
		 double finalprice=0;
		double totalprice=0;
		 int qty=0;
		 if(choice==1) {
			 System.out.println("you selected laptop ..❤️");
			 product = "laptop";
			 price=30000.00;
			 System.out.println("how many quantity you want ..?");
			 qty= sc.nextInt();
			 totalprice= price*qty;
			 
//			 if you want to give discount to user
			 if(totalprice>50000) {
				 System.out.println("Eligible for 5% discount");
				 discount=5;
				 double x= totalprice*0.05;
				 
				 finalprice=totalprice-x;
			 }else {
				 System.out.println("no discount");
				 discount=0;
			 }
		 }
		 
		 System.out.println("===========Reciept============");
		 System.out.println("Product name :" +product);
		 System.out.println("Qty          :" +qty);
		 System.out.println("Total price  :" +totalprice);
		 System.out.println("Discount     :" +discount );
		 System.out.println("final price  :"+ finalprice);
		 
		 

	}

}
