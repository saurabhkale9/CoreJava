package oop2;

public class demo implements new1  {

	@Override
	public void login() {
		System.out.println("hi");
	}
	@Override
	public void sk() {
		System.out.println("sk");
	}
	
	@Override
	public void n1() {
		System.out.println("n1");
	}
	public static void main(String[] args) {
		
		new1 n= new demo();
		n.login();
		new2 n2= new demo();
		n2.login();
		
		n.sk();
		n2.sk();
		n.n1();
		

	}

}
