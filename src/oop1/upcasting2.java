package oop1;

public class upcasting2 extends Upcasting1 {
	
void j1() {
	System.out.println("heyy");
}
	
void dk() {
	System.out.println("this is child method");
}
	public static void main(String[] args) {
		Upcasting1 up= new upcasting2();

		up.sk();
//		up.j1();    call krta yet nahi 
		up.dk();
	}

}
