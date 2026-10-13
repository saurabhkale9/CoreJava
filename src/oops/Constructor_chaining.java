package oops;

public class Constructor_chaining {
	
	Constructor_chaining(){
//		this keyword is used in the constructor only on the first line
//		this keyword used in constructor, method but not only in static method
//	this keyword is used only once in an constructor 
		this(12);
		System.out.println("constructor 1");
	}
	Constructor_chaining(int i){
		this(12,13);
		System.out.println("constructor 2");
	}
	Constructor_chaining(int i, int j){
		System.out.println("constructor 3");
	}
	

	public static void main(String[] args) {
 new Constructor_chaining();
		
	}

}
