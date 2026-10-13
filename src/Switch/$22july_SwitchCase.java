package Switch;

public class $22july_SwitchCase {

	public static void main(String[] args) {
		
//		after the java 14+ there are new feauture of switch case
//		that is 
		
//		advantage ->
//		no need of the break in this version
//		easy
//		we can use also by this way means use multiple cases in single case
//		we can also use expression in switch case
		
//		int day=3;
//		 switch(day){
//		 
//		 case 1 -> System.out.println("monday");
//		 case 2 -> System.out.println("tuesday");
//		 case 3 -> System.out.println("wednesday");
//		 case 4-> System.out.println("thursday");
//		 case 5 -> System.out.println("friday");
//		 case 6 -> System.out.println("saturday");
//		 case 7 -> System.out.println("sunday");
//		 default -> System.out.println("invalid name");
//		 }
		
		
		
//		we can use also by this way
		
		
//		switch(day) {
//		case 6,7 -> System.out.println("weekend");
//		default -> System.out.println("weekday");
//		
//		}
//		
//		int day=2;
//		
//		String dayname=switch(day) {
//		case 1 -> "monday";
//		case 2 -> "tuesday"; 
//		case 3 -> "wednesday";
//		default -> "invalid";
//		
//		};
//		System.out.println(dayname);
		
		
		
		int a= 100, b=20;
		char operator ='+';
		
		int result =switch(operator) {
		case '+'-> a+b;
		case '-' -> a-b;
		case '*'-> a*b;
		case '/' -> a/b;
		default -> 0; 
		};
		System.out.println(result);

	}

}
