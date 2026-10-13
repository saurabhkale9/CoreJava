package Switch;

import java.util.Scanner;

public class $20july_SwitchCase1 {

	public static void main(String[] args) {
		
		
//	switch(9) {
//	case 1: System.out.println("hii");
//	break;
//	case 2: System.out.println("hello");
//	break;
//	case 3: System.out.println("bye");
//	break;
//	case 4 : System.out.println("whats upp");
//	break;
//	default : System.out.println("exit");
//	}
//		Scanner sc= new Scanner (System.in);
//		System.out.println("enter day");
//		int day=sc.nextInt();
//		
//		
//		switch(day) {
//		case 1: System.out.println("monday");
//		break;
//		case 2: System.out.println("tuesday");
//		break;
//		case 3: System.out.println("wednesday");
//		break;
//		case 4: System.out.println("thursday");
//		break;
//		case 5: System.out.println("friday");
//		break;
//		case 6: System.out.println("saturday");
//		break;
//		case 7: System.out.println("sunday");
//		break;
//		default: System.out.println("invalid choice");
//		}
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter grade");
		char grade= sc.next().charAt(0);
		

		switch(grade) {
		case 'A': System.out.println("Excellent");
		break;
		case 'B': System.out.println("good");
		break;
		case 'C':System.out.println("Normal");
		break;
		case 'D': System.out.println("Poor");
		break;
		case 'E':System.out.println("fail");
		break;
		default: System.out.println("Invalid choice");
		}
		
	}

}
