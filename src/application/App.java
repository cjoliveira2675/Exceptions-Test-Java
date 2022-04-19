package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.OperationException;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data:");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withDrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withDrawLimit);
			
			System.out.print("Enter amount for withdaw: ");
			double amount = sc.nextDouble();
			
			account.withDraw(amount);
			
			System.out.print("New balance: $ "+account.getBalance());
		}
		catch (OperationException e) {
			System.out.println("Error in withdraw operation: " + e.getMessage());
		}
		
		
		sc.close();
		
	}

}
