package String;

public class Demo {
public static void main(String[] args) {
	
	String name="saurabh";		//SCP -- 128765342
	String name1="saurabh1";	//SCP -- 987656832
	System.out.println(name==name1);
	
//	== will chwck memory address
	
	String s2= new String("sau");
	String s3= new String("sau");
	System.out.println(s2.equals(s3));
	
//	.equals will check the content in string
}
}
