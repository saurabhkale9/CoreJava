package oops;

public class oops1 {
	
	
	int id= 12;
	String name= "saurabh";
	
	void add()
	{
		System.out.println("add method");
	};

	public static void main(String[] args) {
		oops1 o1= new oops1();
		
		System.out.println(o1.id);
		
		
		oops1 o2= new oops1();
		System.out.println(o2.name);
		

		
		oops1 o3= new oops1();
		System.out.println(o3.id);
		o3.add();
	}

}
