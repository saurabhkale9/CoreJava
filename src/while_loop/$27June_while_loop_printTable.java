package while_loop;

import java.util.Scanner;

public class $27June_while_loop_printTable {

	public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter number : ");
	int num=sc.nextInt();
	int i=1;
	while(i<=10) {
		int sum=num*i;
		i++;
		System.out.println(sum);
	}
	
	}

}
