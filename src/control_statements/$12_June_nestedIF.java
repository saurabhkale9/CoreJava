package control_statements;

import java.util.Scanner;

public class $12_June_nestedIF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dbPin = 1212;
		System.out.println("Enter Pin");
		int pin = sc.nextInt();
		if (pin == dbPin) {

			double bankBalance = 1500.00;

			System.out.println("Welcome to saurabh Banking App");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Widhraw");
			System.out.println("4. Exit");

			System.out.println("Enter Your Choice 1-4");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("Your Current Balance : " + bankBalance);

			} else if (choice == 2) {

				System.out.println("Enter Deposit Amount :");
				double amount = sc.nextDouble();
				if (amount > 0) {
					bankBalance += amount;
					System.out.println("Amount Deposited Successfuly");
					System.out.println("Your Current Balance : " + bankBalance);
				} else {
					System.out.println("Amount is Invalid ");
				}

			} else if (choice == 3) {
				System.out.println("Enter Widrawal Amount : ");
				double widrawal = sc.nextDouble();
				if (widrawal > 0) {

					if (widrawal <= bankBalance) {
						bankBalance -= widrawal;
						System.out.println("Widrawal Successful..");
						System.out.println("Current Balance : " + bankBalance);
					} else {
						System.out.println("Insufficient funds");
					}
				} else {
					System.out.println("Invalid amount");
				}

			} else if (choice == 4) {
				System.out.println("exit successful..");
			} else {
				System.out.println("invalid choice ");
			}
		}else {
			System.out.println("Invalid Pin");
		}

	}

}
