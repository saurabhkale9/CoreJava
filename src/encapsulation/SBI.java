package encapsulation;

public class SBI implements bank{

	public void dopayment() {
		System.out.println("payment through sbi");
	}
	
	public static void main(String[] args) {
		SBI s= new SBI();
		
	}
}
