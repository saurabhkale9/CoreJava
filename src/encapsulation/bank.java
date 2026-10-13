package encapsulation;

public interface bank{

	
	void dopayment(double amount);
	
	static void validateamount(double amount) {
		if(amount<0) {
			System.out.println("please enter amount above 0");
		}
	}
}
