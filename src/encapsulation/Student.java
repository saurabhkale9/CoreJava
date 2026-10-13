package encapsulation;

public class Student {
	
	String name;
	long mobno;
	String address;
	int marks;
	
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public long getmobno() {
		return mobno;
	}
	

	public void setmobno(long mobno) {
		this.mobno=mobno;
	}
	
	public String getaddress() {
		return address;
	}
	
	public void  setaddress(String address) {
		this.address=address;
	}

	public int getmarks() {
		return marks;
	}
	
	public void setmarks(int marks) {
		this.marks=marks;
	}
	
	
	public static void main(String[] args) {
		Student s= new Student();
		s.setname("saurabh");
		System.out.println(s.getname());
		
		s.setaddress("katraj");
		System.out.println(s.getaddress());
		
		s.setmarks(22);
		System.out.println(s.getmarks());

		s.setmobno(87673197);
		System.out.println(s.getmobno());
	}
}
