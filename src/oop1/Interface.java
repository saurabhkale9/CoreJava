package oop1;

public interface Interface {
	int id=12;    //yacha adhi public static final he sgl lihilel ast adhi
	
//	Interface(){
//		
//	};   interface la constructor nsto
	
	String name1= "saurabh";
	
	abstract void login();
	
	public abstract void name();
	public static void main(String[] args) {
//		Interface i1= new Interface;    interface cha object banvta yet ny 
		System.out.println(Interface.id);
		System.out.println(Interface.name);

	}

}
