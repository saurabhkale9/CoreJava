package oops;

public class constructor5 {
	String username;
	String password;
	String email;
	int age;
	
	constructor5(String username,String password,String email,int age){
		if(age>18) {
			this.age=age;
		}else {
			this.age=0;
		}
		this.username=username;
		if(password.length()>5) {
			this.password=password;
		}else {
			this.password="invalid password";
		}
		
		if(email.contains("@")) {
			this.email=email;
		}else{
			this.email="invalid email";
		}
		
		
		display();
		
	}
	
	void display() {
		
		System.out.println("username is : "+username);
		System.out.println("password is: "+password);
		System.out.println("email is : " +email);
		System.out.println("age is : "+ age);
		System.out.println("============");
	}

	public static void main(String[] args) {
	
		new constructor5("saurabh","Saura","saurabh123",12);
		new constructor5("Ritesh","saurabh@123","rt@123",19);
	}

}
