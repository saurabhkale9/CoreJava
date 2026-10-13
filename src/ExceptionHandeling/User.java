package ExceptionHandeling;

import java.util.Scanner;

public class User {
	static void check() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter User id");
		int id=sc.nextInt();
		
		if(id<=0) {
			throw new UserNotFound("User id not found");
		}else {
			System.out.println("User found");
		}
	}

	public static void main(String[] args) {
		try {
		check();
		}
		catch(UserNotFound u){
			System.out.println(u.getMessage());
			
		};


	}

}
