package oop1;

public class javaDevloper extends employee {

	static void javadevloper() {
		System.out.println("this is child method");
	}
	
	void work() {
//		super.work(); 
		eat();
		super.work();
		System.out.println("this is child work method");
	}
	public static void main(String[] args) {
		
		javaDevloper j= new javaDevloper();
	j.employeeid=12;
	j.name="Saurabh";
	j.work();
	j.javadevloper();
	System.out.println(j.employeeid);
	System.out.println(j.name);
		

	}

}
