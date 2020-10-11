package assignment.one.mca;

import java.util.Scanner;
import java.util.HashMap;

interface accountDetails{
	HashMap<String, String> users = new HashMap<String, String>();
	HashMap<String, Double> balance = new HashMap<String, Double>();
	
	public default Boolean validUser(String userName, String adhaarNumber) {
		users.put("John", "1234");
		users.put("James", "4321");
		users.put("Doe", "1232");
		users.put("Anna", "0000");
		if (users.containsKey(userName) && users.containsValue(adhaarNumber)) {
			return true;
		} else {
			return false;
		}
	}
	
	public default double checkBalance(String adhaarNumber, double amount) {
		balance.put("1234", 56000.45);
		balance.put("4321", 780500.00);
		balance.put("1232", 1000000.34);
		balance.put("0000", 500.89);
		return balance.get(adhaarNumber);
	}
}

interface withdrawAmount extends accountDetails {
	public default void withdraw(String adhaarNumber, double amount) {
		double currentBalance;
		currentBalance = balance.get(adhaarNumber) - amount;
		balance.replace(adhaarNumber, currentBalance);
	}
	
	public default void finalMessage(String userName, String adhaarNumber) {
		System.out.println("Mr/Mrs. " + userName + " your current balance is: " + balance.get(adhaarNumber));
	}
}

public class InheritanceProgram implements accountDetails, withdrawAmount {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your 'name': ");
		String name = scan.nextLine();
		
		System.out.print("Enter your last 4 digit 'adhaar number': ");
		String adhaarNumber = scan.nextLine();
		
		System.out.print("Enter the 'amount': ");
		double amount = scan.nextDouble();
		boolean confirmation;
		InheritanceProgram inheritObject = new InheritanceProgram();
		confirmation = inheritObject.validUser(name, adhaarNumber);
		if ( confirmation ) {
			double accountBalance = inheritObject.checkBalance(adhaarNumber, amount);
			if ( Math.floor(accountBalance) > 500) {
				if ( Math.floor(accountBalance) > amount ) {
					inheritObject.withdraw(adhaarNumber, amount);
					inheritObject.finalMessage(name, adhaarNumber);
				} else {
					System.out.println("You don't have that much money!!!");
				}
			} else {
				System.out.println("Your account balance is low!!!");
			}
		} else {
			System.out.println("Your not a valid user!!!");
		}
	}
}
