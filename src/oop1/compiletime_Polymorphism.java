package oop1;

import java.util.Scanner;

public class compiletime_Polymorphism {
	
	void login(long MobileNo) {
		
		int otp=(int)(Math.random()*10000);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter otp"+otp);
		int userOtp=sc.nextInt();
		if(userOtp==otp) {
			System.out.println("Login Successfull");
		}else {
			System.out.println("Login Failed");
		}
	}
		
	
	void login(String username, String password) {
		
		if(username.equals("aadi") && password.equals("1212")) {
			System.out.println("Login Successfull");
		}else {
			System.out.println("Login Failed");
		}
		
	}
	void login(String email) {
		if(email.contains("@")) {
			System.out.println("Login Successfull");
		}
	}

	public static void main(String[] args) {
		compiletime_Polymorphism c= new compiletime_Polymorphism();
//		c.login(8767319757L);
		
//		c.login("aadi","1212");
		c.login("sau@gmail.com");
		

	}

}
