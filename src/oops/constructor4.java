package oops;

public class constructor4 {
	
	int num;
	String name;
	int age;
	
	
	constructor4(int num,String name,int age){
		this.num=num;
		this.name=name;
		this.age=age;
		
	
	}
	
	void show() {
		System.out.println(num);
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		constructor4 c4= new constructor4(1,"saurabh",12); 
		c4.show();
		 
		
		

	}

}
