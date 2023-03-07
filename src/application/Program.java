package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankData;


public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankData bankData;
		
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Is there an initial deposit (n/y)? ");
		
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bankData = new BankData(number,holder,initialDeposit);
		} else {
			bankData = new BankData(number,holder);
		}
		
		System.out.println();
		System.out.println("Account Data: ");
		System.out.println(bankData);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depostitValue = sc.nextDouble();
		bankData.deposit(depostitValue);
		
		System.out.println("Updated account data: ");
		System.out.println(bankData);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		bankData.withdraw(withdrawValue);
		
		System.out.println("Updated account data: ");
		System.out.println(bankData);
		
		
		
		

		
		sc.close();
	
	}

}
