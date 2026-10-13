package encapsulation;

public class User {
	 private String username;
	
	private String password;

	// getter method for getting data
	public String getUsername(){
		return username;
		
	}
	
	public void setUsername(String username) {
		this.username=username;
	}

	
	public String GetPassword() {
		return password;
	}
	
	public void setpassword(String password) {
		this.password=password;
	}
}
