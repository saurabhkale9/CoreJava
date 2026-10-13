package String;

public class city {
public static void main(String[] args) {
	String city="Pune";
	char c[]=city.toCharArray();
	for(int i=0;i<city.length();i++) {
		System.out.println(c[i]);
	}
	
	boolean isMarried =true;
	
	String s= String.valueOf(isMarried);
	System.out.println(s);  
	int x=100;
	String s1= String.valueOf(x);
	System.out.println(s1.charAt(0));

//	convert all data type into string
	
//	vaue of method is used to convert any data type value into string
}
}
