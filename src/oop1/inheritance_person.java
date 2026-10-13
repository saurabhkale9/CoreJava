package oop1;
class Person{
	String name;
	int age;
	String address;
	Person(){
		System.out.println("this is parent class constructor");
	}
	
	void setPersonData(String name, int age, String address) {
		this.name=name;
		this.age=age;
		this.address=address;
		
		
	}
	void showPerson() {
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("address : "+address);
		
	}
}

class Trainer extends Person{
	
	int trainerid;
	String subject;
	
	void setTrainerData(int trainerid,String subject,String name,int age, String address) {
		this.trainerid=trainerid;
		this.subject=subject;
		super.setPersonData(name, age, address);
		
	}
	
	void showTrainer() {
		showPerson();
		
		System.out.println("Trainer id : "+trainerid);
		System.out.println("subject : "+subject);
		
	}
	
	
}

public class inheritance_person extends Trainer{
	String project;
	
	void inheritance_person(String project ,int trainerid,String subject,String name,int age, String address) {
		this.project=project;
		super.setTrainerData(trainerid, subject,name ,age ,address);
//		super.trainerid=trainerid;
//		super.subject=subject;
		
	}

	void showInheritance_person() {
		showTrainer();
		System.out.println("project : "+project);
	}
	public static void main(String[] args) {


		
		inheritance_person i1= new inheritance_person();
//		i1.setPersonData("Saurabh", 22, "Katraj");        //because of this we not need to use below functioons 
//		i1.setTrainerData(101, "Python");
		i1.inheritance_person("java full stack",12,"Python","Saurabh", 22, "Katraj");
		i1.showInheritance_person();
//		i1.showPerson();               //we reduce code because call the method in parent class
//		i1.showTrainer();				// this also same
//		i1.name="saurabh";
//		i1.address="balajinager";
//		i1.age=21;
//		i1.trainerid=12;
		
//		System.out.println(i1.name);
//		System.out.println(i1.age);
//		System.out.println(i1.address);
//		System.out.println(i1.trainerid);
		
	}

}
