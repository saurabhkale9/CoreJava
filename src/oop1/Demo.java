package oop1;

import oop1.Interface;
public class Demo implements Interface{
//	@Override
	public void login() {
		System.out.println("Hi");
		
	}
//	@Override
	public void name() {
		System.out.println("heyy");
	
	}
	public static void main(String[] args) {
		Demo d= new Demo();
		d.login();
//		System.out.println(Demo.login);
		d.name();
		System.out.println(d.name1);
	}

	

}
