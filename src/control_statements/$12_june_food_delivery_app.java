package control_statements;

import java.util.Scanner;

public class $12_june_food_delivery_app {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("welocome to Saurabh food delivery application");

		System.out.println("1.Puri Bhaji -250RS");
		System.out.println("2. Pizza - 400RS");
		System.out.println("3. Burger - 220RS");
		System.out.println("4. Vadapao - 30RS");
		System.out.println("5. Samosa - 20Rs ");
		System.out.println("6. Puneri Misal - 190Rs");
		System.out.println("7. Chaha - 20RS");
		System.out.println("8. Chiken Biryani - 230RS");
		System.out.println("9. Sandwitch - 120RS");
		System.out.println("10. Pav Bhaji");

		System.out.println("What you want order Today");
		int choice = sc.nextInt();
		String orderName = "";
		double discount = 0;
		double gst = 0;
		int totalPrice = 0;
		double serviceCharge = 0;
		double finalprice = 0;
		int qty = 0;
		double deliveryCharges = 0;

		if (choice == 1) {
			orderName = "Puri bhaji";

			int orderPrice = 250;
			System.out.println("how many quantity you want ");

			qty = sc.nextInt();
			totalPrice = orderPrice * qty;

			if (totalPrice > 1000) {
				// Apply 5% discount
				discount = totalPrice * 0.05;
				totalPrice -= discount;
				System.out.println("You got free delivery ");
				gst = 45;
				serviceCharge = 20;
				finalprice = totalPrice + gst + serviceCharge;

			} else {
				System.out.println("no discount");
				System.out.println("delevery charges ");
				deliveryCharges = 40;
				gst = 35;
				serviceCharge = 20;
				finalprice = totalPrice + gst + serviceCharge + deliveryCharges;

			}
		}

		System.out.println("==== Your Final Reciept =====");
		System.out.println("order name         :" + orderName);
		System.out.println("Qty                :" + qty);
		System.out.println("totalPrice         :" + totalPrice);
		System.out.println("Discount           :" + discount);
		System.out.println("gst                :" + gst);
		System.out.println("service charge     :" + serviceCharge);
		System.out.println("Final price to pay :" + finalprice);

		System.out.println("Yours order is on the way  ");

	}

}
