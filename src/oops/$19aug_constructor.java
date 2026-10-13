package oops;

public class $19aug_constructor {
	
	$19aug_constructor() {
		System.out.println("hi this is constructor");
	}
	

	public void fun() {
		System.out.println("this is fun method");
	}
	
	
	public static void main(String[] args) {
//		$19aug_constructor c= new $19aug_constructor();
		
		new $19aug_constructor().fun();      //by this we can call only one method at a time

//		c.fun();
		
	}

}
