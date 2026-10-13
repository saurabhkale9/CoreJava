package oop2;

public class test1  implements test,test2{
	
public static void main(String[] args) {
//	test t= new test();
	test1 t= new test1();
	t.m3();
	t.login();
	t.fun();
	test.m1();
//	test.m2();
//	test1.m2();   private method call nhi hot
	
	test2 t2= new test1();            // apn as pn object banvu shkto upcasting ne
	t2.fun();                  		  // fkt tich method call honr ji tya method madhe ahe 
	

}

	@Override
	public void login() {
		System.out.println("login");
	}
	@Override
	public void fun() {
		System.out.println("fun");
	}
	

}
