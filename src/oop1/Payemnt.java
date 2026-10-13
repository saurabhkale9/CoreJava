package oop1;
class upiPayment{
	
	void pay() {
		System.out.println("Payment using UPI ");
	}
}

public class Payemnt extends upiPayment{
	@Override
	void pay() {
		super.pay();
		System.out.println("Payment Using PhonePay");
	}
			public static void main(String[] args) {
				
				Payemnt p= new Payemnt();
				p.pay();
}
}
