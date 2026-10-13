package encapsulation;

public class main1 {

	public static void main(String[] args) {
		User u= new User();
//		u.username="saurabh";
//		System.out.println(u.username);
		u.setUsername("sk");
	
		u.getUsername();
		System.out.println(u.getUsername());

		u.setpassword("1212");
		System.out.println(u.GetPassword());
	}

}
