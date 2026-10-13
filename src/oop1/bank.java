package oop1;

class SBI extends bank{
	
	SBI(){
		bankbalance=100000;
	}
	
}

class HDFC extends bank{
	HDFC(){
		bankbalance=500000;
	}
	
}

class Axis extends bank{
	Axis(){
	bankbalance=1000000;	
	}
	
}
public class bank {
	double bankbalance;
	
	void calculateInterest() {
		
	}
	
	void deposit(int amount) {
		if(amount>0) {
			bankbalance+=amount;
			System.out.println("Deposit successfull : "+bankbalance);
			
		}
		
	}
	
	void widraw() {
		
	}

	public static void main(String[] args) {
		SBI s= new SBI();
		s.calculateInterest();
		System.out.println(s.bankbalance);
		s.deposit(1000);
		
		HDFC h= new HDFC();
		h.calculateInterest();
		System.out.println(h.bankbalance);
		s.deposit(20000);
		
		Axis a= new Axis();
		a.calculateInterest();
		System.out.println(a.bankbalance);
		s.deposit(40000);
		

	}

}
